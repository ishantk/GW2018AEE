package com.auribises;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object bean1, Method method, Object[] inputs, Object bean2) throws Throwable {
		if(method.getName().equals("allocateSeatAndDept")){
			System.out.println("==AfterAdvice==");
		}
	}

}
