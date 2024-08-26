package com.demo.ex1;

public class Main {

	public static void main(String[] args) {
		Greeter goodMorning=(name)-> "Good Morning"+name;
		
		Runnable r=()->System.out.println("hello");
		
		Concat c=(s1,s2)->s1 + " " +s2;
		
		System.out.println(c.doConcat("HARSH", "MANE"));
		
	}

}
