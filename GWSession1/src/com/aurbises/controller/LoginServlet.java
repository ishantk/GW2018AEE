package com.aurbises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.db.JDBCHelper;
import com.auribises.model.User;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// DB Connectivity Code: Logic
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean login = helper.authenticateUser(user);
		helper.closeConnection();
			
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		if(login){
			out.print("<h3><i>Login is Success</i></h3>");
			out.print("<h4><a href='Welcome'>Enter Home</a></h4>");
		}else{
			out.print("<h3><i>Invalid Credentials</i></h3>");
		}
	}

}
