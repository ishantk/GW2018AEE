package com.auribises;

import java.util.Date;

// Web Service
public class Conversion {
	
	// Web Method : They must be public and should return something not void
	public int dollarToInr(int dollars){
		int inr = dollars*70;
		return inr;
	}

	public int feetToInches(int feet){
		int inches = feet*12;
		return inches;
	}

	public String registerUser(String name, String phone){
		// JDBC Code...
		int otp = (int)Math.random();
		String response = "Please Enter "+otp+" to register";
		return response;
	}
	
	public String sayHello(String name){
		String response = "Hello, "+name+" Its: "+new Date();
		return response;
	}
}
