package com.demo.exceptions;

public class ExceptionDemo3 {
	public static void main(String[] args) {
	try {
		int a=10;
		int b=10;
		double d=a/b;
		int[] nums = new int[5];
		System.out.println(nums[4]);
		
		String[] name = new String[4];
		System.out.println(name[3].length());
		
		System.out.println("No Exception");
		
		}catch(ArithmeticException |ArrayIndexOutOfBoundsException |NullPointerException e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("The program resumed normal flow..");

}
}

