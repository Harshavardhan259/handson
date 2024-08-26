package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Trainer trainer =(Trainer) ctx.getBean("trainer");
		
		
		System.out.println(trainer.getName());
		System.out.println(trainer.getParticipant().get(2));
		
		
		
		
		
	}

}
