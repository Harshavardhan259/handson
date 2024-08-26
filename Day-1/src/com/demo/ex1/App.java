package com.demo.ex1;

public class App {

	public static void main(String[] args) {
		Box b = new Box(20,30,40);
		Box b1 = new Box(10,20,40,"blue");
		
		Box b2=b1;
		Box b3 = new Box(10,20,40,"Red",68.6);
		
		//System.out.println(b2.getColor());
		
		//System.out.println(b.getValume());
		//System.out.println(b1.getValume());
		//System.out.println(b1.getColor());
		//System.out.println(b3.getWeight());
		
		Person john=new Person(1,"John");
		Person peter=new Person(2,"Peter","peter@nowher.com");

		System.out.println(john.getId()+" "+john.getName());
		System.out.println(peter.getId()+" "+peter.getName()+" "+ peter.getEmail());
		
		john.setMobile(524367);
		System.out.println(john.getMobile());
		
		john.setEmail("john@nowher.com");
		System.out.println(john.getEmail());
	}
}
