package com.demo.factorials;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = in.nextInt();
		
		Factorial f =new Factorial(num);
		
		System.out.println("The Factorial of given number is:"+f.getFactorialFor());
		System.out.println("The Factorial of given number is:"+f.getFactorialWhile());
	}

}
