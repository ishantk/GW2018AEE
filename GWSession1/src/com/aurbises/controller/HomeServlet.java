package com.aurbises.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Welcome", "/Home" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		
		out.print("<h3>Welcome User<br/>Its: "+date+"</h3>");
		
		// Read the Cookies
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			//if(ck.getName().equals("keyName")){
				
			//}
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		// Get Data from URL
		//String name = request.getParameter("keyName");
		//String age = request.getParameter("keyAge");
		
		// Get Data from Hidden Form
		//String name = request.getParameter("txtName");
		//String age = request.getParameter("txtAge");
		
	
		// Get Data from HTTPSession API
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		
		out.print("Name : "+name+"<br/>Age: "+age);
		
		// Extract Data from these API's
		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		
		//...
		
	}

}
