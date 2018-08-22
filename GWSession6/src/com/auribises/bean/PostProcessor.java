package com.auribises.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("==postProcessAfterInitialization=="+beanId);
		return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("==postProcessBeforeInitialization=="+beanId);
		return bean;
	}
}
