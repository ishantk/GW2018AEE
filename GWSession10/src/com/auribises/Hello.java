package com.auribises;

import java.util.Date;
//JAX-RS
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer;



@Path("/hello")
public class Hello { // Web Service

	// Web Methods:
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){
		// Write your core business logic here
		Date date = new Date();
		String response = "Plain Hello, Its: "+date;
		return response; // Textual Response
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		Date date = new Date();
		String response = "<html><body><i><b>HTML Hello, Its: "+date+"</b></i></body></html>";
		return response; // HTML Response
	}
	
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		Date date = new Date();
		String response = "<?xml version='1.0' encoding='UTF-8'?><hello>XML Hello, Its: "+date+"</hello>";
		return response; // XML Response
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		Date date = new Date();
		String response = "{'response':'JSON Hello, Its:"+date+"'}";
		return response; // JSON Response
	}
	
	// Execute this guy below using Jersey 
	public String registerUser(String name, String email, String password){
		
		String response = "";
		
		return response; // JSON Response
	}
	
}
