package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService service =(EmployeeService) ctx.getBean("employeeService");
		
		System.out.println(service.registerEmp(101, "harsh", "Bhoj", 40000));
		
		
		
	}

}
