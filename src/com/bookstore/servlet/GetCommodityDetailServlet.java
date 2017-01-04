package com.bookstore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/GetCommodityDetailServlet.action")
public class GetCommodityDetailServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");

		PrintWriter out = resp.getWriter();

		boolean result = false;
		String strId = req.getParameter("id");
		if (strId != null) {
			try {
				int id = Integer.parseInt(strId);
				CommodityBiz commodityBiz = new CommodityBizImpl();
				
				CommodityItem commodityItem = commodityBiz.getCommodityItemById(id);
				req.setAttribute("album", commodityItem);
				result = true;
				Mapper mapper = new MapperBuilder().build();
				mapper.writeObject(commodityItem, out);
				
				out.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(!result) {
			JsonGenerator generator = Json.createGenerator(out);
			generator.writeStartObject().write("message", "The details of the album cannot be obtained!").writeEnd();
			out.close();
		}
	}
}
