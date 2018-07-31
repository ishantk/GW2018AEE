package com.aurbises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		String name = "Leo Watosn";
		int age = 30;
		
		if(login){
			
			//1. Cookie
			/*Cookie ck1 = new Cookie("keyName", name);
			Cookie ck2 = new Cookie("KeyAge", String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
		
			
			out.print("<h3><i>Login is Success</i></h3>");
//			out.print("<h4><a href='Welcome'>Enter Home</a></h4>");
			
			//2. URL Re-Writing
			//out.print("<h4><a href='Welcome?keyName="+name+"&keyAge="+age+"'>Enter Home</a></h4>");
			
			//3. Hidden Form Field
			/*String form = "<html>"
						+ "<form action='Welcome' method='post'>"
						+ "<input type='hidden' name='txtName' value='"+name+"'/>"
						+ "<input type='hidden' name='txtAge' value='"+age+"'/>"
						+ "<input type='submit' value='Enter Home'/>"
						+ "</form>"
						+ "</html>";
			
			out.print(form);*/
			
			
			
			//4. HttpSession API
			
			out.print("<h4><a href='Welcome'>Enter Home</a></h4>");
			
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);			
			
		}else{
			out.print("<h3><i>Invalid Credentials</i></h3>");
		}
	}

}
