package com.demo.ex2;

public class Duke {
	
	private static int count=0;
	private String name;
	public Duke(String name) {
		this.name=name;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public String getName() {
		return this.name;
	}
	
	static {
		System.out.println("static block execute");
	}
}
