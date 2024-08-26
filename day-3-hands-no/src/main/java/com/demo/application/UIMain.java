package com.demo.application;

public class UIMain {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		String result=service.registerEmployee(1, "harsh", 100, "18d", "belgaum", 1234);
		System.out.println(result);

	}

}
