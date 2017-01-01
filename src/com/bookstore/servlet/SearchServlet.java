package com.bookstore.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.biz.CommodityBiz;
import com.bookstore.biz.impl.CommodityBizImpl;
import com.bookstore.entity.CommodityItem;

@WebServlet("/SearchServlet.action")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String keywords = request.getParameter("keywords");
		CommodityBiz commodityBiz = new CommodityBizImpl();
		
		Vector<CommodityItem> commodityItems = new Vector<>();
		//按书名查找
		commodityItems.addAll(commodityBiz.getCommodityItemsByBookName(keywords));
		//按作者查找
		commodityItems.addAll(commodityBiz.getCommodityItemsByBookAuthor(keywords));
		//按分类查找
		commodityItems.addAll(commodityBiz.getCommodityItemsByBookCategory(keywords));
		//按卖家查找
		commodityItems.addAll(commodityBiz.getCommodityItemsBySellerName(keywords));
		
		request.setAttribute("commodityItems", commodityItems);
		//跳转到搜索结果呈现页
		request.getRequestDispatcher("commodityItems.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
