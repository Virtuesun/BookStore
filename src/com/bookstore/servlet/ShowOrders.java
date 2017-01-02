package com.bookstore.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.biz.OrderBiz;
import com.bookstore.biz.impl.OrderBizImpl;
import com.bookstore.entity.Order;
import com.bookstore.entity.User;

@WebServlet("/Auth/ShowOrders.action")
public class ShowOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("login");
		OrderBiz orderBiz = new OrderBizImpl();
		Vector<Order> orders = null;
		if("买家".equals(user.getRole())){
			orders = orderBiz.getOrderByBuyerId(user.getId());
		}else if("卖家".equals(user.getRole())){
			orders = orderBiz.getOrderBySellerId(user.getId());
		}
		
		request.setAttribute("showOrders", orders);
		request.getRequestDispatcher("/Auth/showOrders.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
