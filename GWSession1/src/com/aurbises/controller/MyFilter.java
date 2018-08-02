package com.aurbises.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/MyFilter")
public class MyFilter implements Filter {

	
	public void destroy() {
		System.out.println("==Filter destroy executed==");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// Pre-Processing
		PrintWriter out = response.getWriter();

		out.print("== Filter Pre-Processing == <br/>");
		
		// pass the request along the filter chain
		// call chain.doFilter only if username and password is not empty
		chain.doFilter(request, response);
		
		
		// Post-Processing
		
		out.print("== Filter Post-Processing == <br/>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("==Filter init executed==");
	}

}
