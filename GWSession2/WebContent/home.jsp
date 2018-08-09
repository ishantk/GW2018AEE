<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Home</title>
</head>
<body>

	<%
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
	%>

	<h3>Welcome  <%= name %> </h3>
	<h4><%= email %> </h4>
	<%
		Date date = new Date();
	%>
	<b>Its <%= date %></b>
	
	
	
</body>
</html>