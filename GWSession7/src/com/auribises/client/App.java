package com.auribises.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auribises.bean.Address;
import com.auribises.bean.CB;
import com.auribises.bean.Person;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Address a = context.getBean("aRef",Address.class);
		//System.out.println(a);
		
		//Person p = context.getBean("pRef",Person.class);
		//System.out.println(p);
		//System.out.println(p.getCertificates());
		
		CB cRef = context.getBean("cb",CB.class);
		cRef.getCa().sayHello("Sia");
	}

}
