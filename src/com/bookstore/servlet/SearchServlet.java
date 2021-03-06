package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.johnzon.mapper.Mapper;
import org.apache.johnzon.mapper.MapperBuilder;

import com.bookstore.biz.CommodityBiz;
import com.bookstore.biz.impl.CommodityBizImpl;
import com.bookstore.entity.CommodityItem;

@WebServlet("/SearchServlet.action")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		String keywords = request.getParameter("keywords");
		PrintWriter out = response.getWriter();

		boolean result = false;
	
			try {
				
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
				//request.getRequestDispatcher("searchPage.jsp").forward(request, response);
				
				result = true;
				Mapper mapper = new MapperBuilder().build();
				mapper.writeObject(commodityItems, out);
				
				out.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		if(!result) {
			JsonGenerator generator = Json.createGenerator(out);
			generator.writeStartObject().write("message", "The details of the album cannot be obtained!").writeEnd();
			out.close();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
