package com.demo.spring;

public class GreetService {
	private Greet greet;
	
	
	public Greet getGreet() {
		return greet;
	}


	public void setGreet(Greet greet) {
		this.greet = greet;
	}


	public void greet() {
		System.out.println(greet.greetMessage());
	}
}
