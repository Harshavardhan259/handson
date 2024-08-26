package com.demo.constructors;

public class Main {

	public static void main(String[] args) {
		Students s = new Students();
		Students s1 =new Students(1);
		
		System.out.println("Student Id :"+s.getId()+" "+s.getName());
		System.out.println("Student Id :"+s1.getId()+" "+s1.getName());

	}

}
