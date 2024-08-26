package com.demo.code;

import java.util.Scanner;

public class MainByteCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the code:");
		int num = in.nextInt();
		
		CityByCode c = new CityByCode();
		System.out.println("City name is:"+c.getCityByCode(num));
		
		in.close();
	}

}
