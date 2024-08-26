package com.demo.exceptions;


public class ExceptionDemo4 {

	public static void main(String[] args) {
		try {
		String name = "john";
		int num = Integer.parseInt(name);
		System.out.println(num);
		
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
