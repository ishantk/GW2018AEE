package com.aurbises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auribises.db.HibernateHelper;
import com.auribises.db.JDBCHelper;
import com.auribises.model.User;


@WebServlet({ "/RegisterServelt", "/Register", "/Register.do" })
public class RegisterServelt extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("==init executed==");
	}

	
	public void destroy() {
		System.out.println("==destroy executed==");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==service executed==");
		
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		/*JDBCHelper helper = new JDBCHelper(); // Load the Driver
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();*/
		
		HibernateHelper helper = new HibernateHelper();
		helper.registerUser(user);
		
		// To send back Response
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//String json = "{\"success\":\"registered\",\"name\":\""+user.name+"\"}";
		
		out.print(user.name+" Registered !!");
		
		/*out.print("<html>");
		if(i>0){
			out.print("<b>Thank you For Registering with Us !</b>");
		}else{
			out.print("<b>Registration Failed ! Please Try Again Later</b>");
		}
		out.print("</html>");*/
		
	}

}
