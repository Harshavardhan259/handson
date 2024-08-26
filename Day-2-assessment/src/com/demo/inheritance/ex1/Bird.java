package com.demo.inheritance.ex1;

public abstract class Bird {
	protected String name;
	protected String color;
	
	public Bird(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public abstract String getName();
	public abstract String getColor();
}
