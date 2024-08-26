package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Customer cust =(Customer) ctx.getBean("customer");
		
		System.out.println(cust.getName());
		System.out.println(cust.getEmails());
		
		
		
	}

}
