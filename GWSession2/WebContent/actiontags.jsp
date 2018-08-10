<%@	page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Action Tags</title>
</head>
<body>
	<h3>Action Tags:</h3>
	<jsp:include page="printdate.jsp"/>
	
	<%-- <jsp:forward page="jspdemo.jsp"/> --%>
	<%-- <jsp:forward page="newuser.html"/> --%>
	
	<%
	
		User uRef = new User();
		uRef.setUid(101);
		uRef.setName("John");
		uRef.setEmail("john@example.com");
		//uRef.setPassword("pass123");
		uRef.password = "pass123";
	
	%>
	<h4>ID is: <%= uRef.getUid() %></h4>
	<h4>Name is: <%= uRef.getName() %></h4>
	<h4>Email is: <%= uRef.getEmail() %></h4>
	<h4>Password is: <%= uRef.password %></h4> 
	
	<b>========================</b>
	
	<jsp:useBean id="uRef1" class="com.auribises.model.User"/>
	
	<jsp:setProperty property="uid" name="uRef1" value="102"/>
	<jsp:setProperty property="name" name="uRef1" value="Jennie"/>
	<jsp:setProperty property="email" name="uRef1" value="jennie@example.com"/>
	<jsp:setProperty property="password" name="uRef1" value="password123"/>
	
	<h4>ID is: <jsp:getProperty name="uRef1" property="uid"/> </h4>
	<h4>Name is: <jsp:getProperty name="uRef1" property="name"/> </h4>
	<h4>Email is: <jsp:getProperty name="uRef1" property="email"/> </h4>
	<h4>Password is: <jsp:getProperty name="uRef1" property="password"/></h4>
	
</body>
</html>