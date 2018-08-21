package com.auribises.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.auribises.bean.Connection;

public class App {

	public static void main(String[] args) {
		
		// Traditional Way of Creating Object in Java:
		Connection con = new Connection();
		con.setDriverName("a.b.c.d");
		con.setUrl("any://someurl");
		con.setUser("root");
		con.setPassword("pass123");
		
		System.out.println(con);
		
		// Spring Way:
		// 1. IOC Container : BeanFactory
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		/*Connection c1 = (Connection)factory.getBean("con1");
		Connection c2 = factory.getBean("con2",Connection.class);
		
		System.out.println(c1);
		System.out.println(c2);*/
		
		// 2. IOC Container : ApplicationContext
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Connection c1 = (Connection)context.getBean("con1");
		Connection c2 = context.getBean("con2",Connection.class);
		
		System.out.println(c1);
		System.out.println(c2);*/
		

	}

}
