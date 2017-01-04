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


@WebServlet("/GetAllCommotidyServlet.action")
public class GetAllCommotidyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();

		boolean result = false;
	
		
			try {
				
				CommodityBiz commodityBiz= new CommodityBizImpl();
				Vector<CommodityItem> commodityItems = commodityBiz.getAllCommodityItems();
				
				request.setAttribute("commodityItems", commodityItems);
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
