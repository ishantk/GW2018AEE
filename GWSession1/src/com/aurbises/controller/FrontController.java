package com.aurbises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(!email.isEmpty() && !password.isEmpty()){
			
			out.print("<b>Front Controller</b>");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			dispatcher.forward(request, response);
			
		}else{
			
			//response.sendRedirect("https://www.google.co.in?q=auribises");
			out.print("<b>Please Enter Details First</b>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("exisitinguser.html");
			dispatcher.include(request, response);
			
		}
		
	}

}
