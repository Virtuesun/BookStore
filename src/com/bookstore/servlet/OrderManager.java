package com.bookstore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.biz.OrderBiz;
import com.bookstore.biz.impl.OrderBizImpl;
import com.bookstore.entity.Order;

@WebServlet("/OrderManager.action")
public class OrderManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OrderBiz orderBiz = new OrderBizImpl();
		request.setCharacterEncoding("UTF-8");
		// 对应：按钮name->商品id 按钮value->操作#id 确定订单，取消订单用同一name
		// 格式：确定订单#2
		String source = request.getParameter("operation");
		String operation = source.split("#")[0];
		String id_order = source.split("#")[1];

		Order order = orderBiz.getOrderById(Integer.parseInt(id_order));

		if ("确认订单".equals(operation)) {
			order.setState("确认");
			/*
			 * //严格模式 if(orderBiz.update(order)){ //确认订单成功
			 * request.setAttribute("message", "确认订单成功！"); }else{ //确认订单失败
			 * request.setAttribute("message", "确认订单失败！"); }
			 * request.getRequestDispatcher("message.jsp").forward(request,
			 * response);
			 */
		} else if ("取消订单".equals(operation)) {
			order.setState("取消");
			/*
			 * //严格模式 if(orderBiz.update(order)){ //取消订单成功
			 * request.setAttribute("message", "取消订单成功！"); }else{ //取消订单失败
			 * request.setAttribute("message", "取消订单失败！"); }
			 * request.getRequestDispatcher("message.jsp").forward(request,
			 * response);
			 */
		} else {
			// 未知错误
			response.sendRedirect("index.jsp");
			return;
		}

		// 更新
		orderBiz.update(order);
		response.sendRedirect("orderManage.jsp");
	}

}
