package com.bookstore.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.util.CaptchaGenerator;


@WebServlet("/CaptchaServlet.action")
public class CaptchaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		CaptchaGenerator captcha = new CaptchaGenerator(20, 60);
		
		captcha.generate();

		// 将认证码存入SESSION
		session.setAttribute("captcha", captcha.getValue());
		OutputStream oStream = response.getOutputStream();
		ImageIO.write(captcha.getImage(), "JPEG", oStream);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
