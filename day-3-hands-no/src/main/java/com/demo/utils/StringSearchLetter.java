package com.demo.utils;

import java.util.Scanner;

public class StringSearchLetter {

	public static void main(String[] args) {
		String input=" AxBndtyTxtzU";
		//char l='t';
		String sc="t";
		//Scanner in =new Scanner(System.in);
		//System.out.println("Enter the String");
		
		
		char l=sc.trim().toLowerCase().toCharArray()[0];
		
		char[] chars=input.trim().toLowerCase().toCharArray();
		int count=0;
		for(char c:chars) {
			if(c==l) {
				count++;
			}
		}
		
		System.out.println(l+" appeard for "+count+" times");

	}

}
