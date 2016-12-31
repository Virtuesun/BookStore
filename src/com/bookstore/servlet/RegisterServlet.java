package com.bookstore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.biz.UserBiz;
import com.bookstore.biz.impl.UserBizImpl;
import com.bookstore.entity.User;
import com.bookstore.util.EncryptionUtil;

@WebServlet("/RegisterServlet.action")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     //////////////////////////////////////////////////
		//String role = request.getParameter("role");
		String username = request.getParameter("username");
		String showname = request.getParameter("showname");
		String password = request.getParameter("password");
		String captcha = request.getParameter("captcha");
		HttpSession session = request.getSession();
		
		//注册成功标志
		boolean success = true;
		
		
		if(!isLegalUsername(username)){
			request.setAttribute("error_username", "非法的用户名");
			success = false;
		}
		if(!isLegalShowname(showname)){
			request.setAttribute("error_showname", "非法的显示名");
			success = false;
		}
		if(!isLegalPassword(password)){
			request.setAttribute("error_password", "非法的密码");
			success = false;
		}
		if(captcha==null||!captcha.equalsIgnoreCase((String)session.getAttribute("captcha"))){
			request.setAttribute("error_captcha", "验证码错误");
			success = false;
		}
		
		if(success){
			//合法输入
			request.removeAttribute("error_username");
			request.removeAttribute("error_showname");
			request.removeAttribute("error_password");
			request.removeAttribute("error_captcha");
			UserBiz userBiz = new UserBizImpl();
			User user = userBiz.getUserByUserName(username);
			if(user == null){
				//用户名不存在，可以注册
				request.removeAttribute("error_username");
				user = new User();
				//////////////////////////////////////////////////
				user.setRole("买家");
				user.setUsername(username);
				user.setShowname(showname);
				user.setPassword(EncryptionUtil.getHash2(password, "MD5"));
				if(userBiz.register(user)){
					//注册成功
					request.removeAttribute("message");
					response.sendRedirect("login.jsp");
				}else{
					//注册失败
					request.setAttribute("message", "注册失败");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}
			}else{
				//用户名已存在
				request.setAttribute("error_username", "账号被占用");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}else{
			//非法输入
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		
	}
	
	/**
	 * 判断字符串是否是合法用户名。
	 * 
	 * @param username
	 * @return
	 */
	private boolean isLegalUsername(String username) {
		// 检查用户名长度
		if (username==null || username.length() <3 || username.length() > 20) {
			return false; 
		}
		
		// 扫描输入字符合法性
		for (int i = 0; i < username.length(); i++) { 
			char temp = username.charAt(i);
			if (temp < '0' || (temp > '9' && temp < 'A') || (temp > 'Z' && temp < 'a' && temp != '_') || temp > 'z') { // 用户名只能包含数字、字母、下划线
				return false;
			}
		}

		 // 检查用户名首字母合法性
		if (username.charAt(0) < 'A' || (username.charAt(0) > 'Z' && username.charAt(0) < 'a')
				|| username.charAt(0) > 'z') {
			return false;
		}

		return true;
	}
	
	/**
	 * 判断字符串是否是合法显示名
	 * 
	 * @param showname
	 * @return
	 */
	private boolean isLegalShowname(String showname) {
		if (showname.length() < 2 || showname.length() > 20) { // 检查显示名长度
			return false;
		}
		
		return true;
	}
	
	/**
	 * 判断字符串是否是合法密码。
	 * 
	 * @param password
	 * @return
	 */
	private boolean isLegalPassword(String password) {
		// 检查用户名长度
		if (password == null || password.length() < 6 || password.length() > 20) {
			return false;
		}
		
		return true;
	}


}
