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


@WebServlet("/LoginServlet.action")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//密码加密
		password = EncryptionUtil.getHash2(password, "MD5");
		
		UserBiz userBiz = new UserBizImpl();
		User user = userBiz.getUserByUserName(username);
		if(user==null|| !user.getPassword().equals(password)){
			request.setAttribute("message", "用户名或密码错误！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			request.removeAttribute("message");
			session.setAttribute("login", user);
			if (user.getRole().equals("买家")) {
				response.sendRedirect("index.jsp");
			}else{
				response.sendRedirect("seller_info.jsp");
			}
		}
	}

}
