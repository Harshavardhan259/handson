package com.demo.exception.ex1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		
		try {

			Scanner in = new Scanner(System.in);
			System.out.println("Enter amount:");
			double amount = in.nextInt();
			Account a=new Account(amount);
			System.out.println(a.getBalance());
			System.out.println("Enter withdral amount:");
			double wamount=in.nextDouble();
			System.out.println(a.withdraw(wamount));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Code is running sccesfully..");
		

	}

}
