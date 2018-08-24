package com.auribises;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = context.getBean("empProxy",Employee.class);
		System.out.println(e);
		
		e.allocateSeatAndDept(12);

	}

}
