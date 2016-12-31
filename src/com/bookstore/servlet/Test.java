package com.bookstore.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.biz.BookBiz;
import com.bookstore.biz.CommodityBiz;
import com.bookstore.biz.OrderBiz;
import com.bookstore.biz.ProjectBiz;
import com.bookstore.biz.UserBiz;
import com.bookstore.biz.impl.BookBizImpl;
import com.bookstore.biz.impl.CommodityBizImpl;
import com.bookstore.biz.impl.OrderBizImpl;
import com.bookstore.biz.impl.ProjectBizImpl;
import com.bookstore.biz.impl.UserBizImpl;
import com.bookstore.entity.Book;
import com.bookstore.entity.Commodity;
import com.bookstore.entity.Order;
import com.bookstore.entity.Project;
import com.bookstore.entity.User;

@WebServlet("/Test.action")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserBiz userBiz = new UserBizImpl();
		User user = new User();
		user.setUsername("username");
		user.setRole("买家");
		user.setShowname("showname");
		user.setPassword("password");
		System.out.println(userBiz.register(user));
		System.out.println(userBiz.getUserById(1));
		
		BookBiz bookBiz = new BookBizImpl();
		Book book = new Book();
		book.setName("name");
		book.setAuthor("author");
		book.setIsbn("isbn");
		book.setPress("press");
		book.setVerson("verson");
		book.setPages(100);
		book.setWords(2100);
		book.setDate(new java.sql.Date(System.currentTimeMillis()));
		book.setSize(12);
		book.setPaper("paper");
		book.setCategories("categories");
		System.out.println(bookBiz.insert(book));
		System.out.println(bookBiz.getBookById(1));
		
		CommodityBiz commodityBiz = new CommodityBizImpl();
		Commodity commodity = new Commodity();
		commodity.setId_book(bookBiz.getBookById(1).getId());
		commodity.setId_seller(userBiz.getUserById(1).getId());
		commodity.setPrice(50.3);
		commodity.setNumber(20);
		commodity.setTitle("title");
		commodity.setDescription("description");
		commodity.setImage("image");
		System.out.println(commodityBiz.insert(commodity));
		System.out.println(commodityBiz.getCommodityById(1));
		
		ProjectBiz projectBiz = new ProjectBizImpl();
		Project project = new Project();
		project.setId_commodity(commodityBiz.getCommodityById(1).getId());
		project.setNumber(50);
		System.out.println(projectBiz.insert(project));
		System.out.println(projectBiz.getProjectById(1));
		
		OrderBiz orderBiz = new OrderBizImpl();
		Order order = new Order();
		order.setOrderId("2014110417");
		order.setState("待确认");
		order.setId_project(projectBiz.getProjectById(1).getId());
		order.setId_buyer(userBiz.getUserByUserName("username").getId());
		System.out.println(orderBiz.insert(order));
		System.out.println(orderBiz.getOrderById(1).getTimestamp());

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
