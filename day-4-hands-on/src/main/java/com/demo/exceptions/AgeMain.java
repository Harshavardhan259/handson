package com.demo.exceptions;

import java.util.Scanner;

public class AgeMain {
	public static void main(String[] args) {
		try {

			Scanner in = new Scanner(System.in);
			System.out.println("Enter age:");
			int age = in.nextInt();
			AgeValidater n = new AgeValidater(age);

			System.out.println(n.validateAge());
			
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Code is running sccesfully..");
	}
}