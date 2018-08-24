package com.auribises;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] inputs, Object bean) throws Throwable {
		
		if(method.getName().equals("allocateSeatAndDept")){
			
			System.out.println("==BeforeAdvice==");
			
			System.out.println("==Inputs==");
			for(Object o : inputs){
				System.out.println(o);
			}
			
			System.out.println("==Bean==");
			Employee emp = (Employee)bean; // Downcasting
			System.out.println(emp.getName());
		}
		
	}
	
}
