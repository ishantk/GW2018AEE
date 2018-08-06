<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to JSP Demo</h3>
	<h2>Scriptlet - Where we can code in Java</h2>
		
	<%
		int a = 10;
		int b = 20;
		int c = a+b;
		
		out.print("c is: "+c);
		
		int age = 10;
		if(age>18){
	%>
		<b><i><h2>You Can Vote !!</h2></i></b>
	<%		
		}else{
	%>		
		<b><i><h2>You Cannot Vote !!</h2></i></b>
	<%		
		}
	%>
	
	<b>pi is: <% out.print(pi); %></b>
	<br/>
	<b>area of circle with radius 5.65 is: <% out.print(areaOfCircle(5.65f)); %></b>
	
	<h3>Declarative Tag</h3>
	<%!
		float pi = 3.14f;
		float areaOfCircle(float radius){
			float area = pi * radius * radius;
			return area;
		}
	%>
	
	<b>c is: <% out.print(c); %></b>
	
	<h3>Expression Tag</h3>
	<b>c is: <%= c %></b>
	<br/>
	<b>area of circle with radius 7.65 is: <%= areaOfCircle(5.65f) %></b>
	
</body>
</html>