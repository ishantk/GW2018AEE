<%@ page import="com.auribises.db.JDBCHelper"%>
<%@ page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>

	<%
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		/*JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();*/
		
		
		/*Cookie ck1 = new Cookie("keyName",user.name);
		Cookie ck2 = new Cookie("keyEmail",user.email);
		
		response.addCookie(ck1);
		response.addCookie(ck2);*/
		
		// How we can clear the cookies ??
		// Explore
		
		// Assignment : Implement One time Login with Cookies | Remember Me
		
		// HttpSession
		session.setAttribute("keyName", user.name);
		session.setAttribute("keyEmail", user.email);
		
		// Assignment : Inplement LoginIn | LogOut
		
		//session.invalidate(); -> remove everything from Session Object
		
		//if(i>0){
	%>		
		<h2>Registration Successful !!</h2>
		<a href="home.jsp">Enter Home</a>
		
		
	<%
		//}else{
	%>	
		<!-- <h2>Registration Failed !!</h2> -->
	<%
		//}
	%>

</body>
</html>