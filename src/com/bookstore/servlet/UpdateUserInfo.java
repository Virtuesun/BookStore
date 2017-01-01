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


@WebServlet("/UpdateUserInfo.action")
public class UpdateUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("login");
		
		//更新用户
		user.setShowname(request.getParameter("showname"));
		user.setPassword(request.getParameter("password"));
		user.setSex(request.getParameter("sex"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setEmail(request.getParameter("email"));
		user.setPhone(request.getParameter("phone"));
		user.setAddress(request.getParameter("adress"));
		
		UserBiz userBiz = new UserBizImpl();
		if(userBiz.update(user)){
			//更新成功
			session.setAttribute("login", user);
			request.setAttribute("message", "资料修改成功！");
		}else{
			//更新失败
			request.setAttribute("message", "资料修改失败！");
		}
		
		request.getRequestDispatcher("userInfo.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
