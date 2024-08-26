package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context3.xml");
		
		GreetService greet1 =(GreetService) ctx.getBean("greetBean");
		
		greet1.greet();
		

		GreetService greet2 = (GreetService) ctx.getBean("greetBean");
		
		System.out.println(greet1==greet2);
		
	}

}
