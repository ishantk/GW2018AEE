package com.auribises.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.auribises.model.Book;


@WebServlet({ "/JSONServlet", "/News" })
public class JSONServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		StringBuffer jsonResponse = new StringBuffer();
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		try{
			
			URL url = new URL("http://www.json-generator.com/api/json/get/chQLxhBjaW?indent=2");
			URLConnection connection = url.openConnection(); // Send the Request to Server
			
			// Receiving the Response
			InputStream inputStream = connection.getInputStream();
			InputStreamReader reader = new InputStreamReader(inputStream);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			while((line = buffer.readLine()) !=null ){
				jsonResponse.append(line);
			}
			
			//out.print("JSON Response is: "+jsonResponse.toString());
			
			JSONObject jsonObject = new JSONObject(jsonResponse.toString());
			JSONArray jsonArray = jsonObject.getJSONArray("bookstore");
			for(int i=0;i<jsonArray.length();i++){
				
				JSONObject jObj = jsonArray.getJSONObject(i);
				
				Book book = new Book();
				book.price = jObj.getString("price");
				book.name = jObj.getString("name");
				book.author = jObj.getString("author");
				
				books.add(book);
			}
			
			// Code Here to represent the JSON Data in the form of Table
			out.print("<html><body><table>");
			for(Book book : books){
				out.print("<tr>");
				
				out.print("<td>"+book.price+"</td>");
				out.print("<td>"+book.name+"</td>");
				out.print("<td>"+book.author+"</td>");
				
				out.print("</tr>");
			}
			out.print("</table></body></html>");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
