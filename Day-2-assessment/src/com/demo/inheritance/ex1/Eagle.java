package com.demo.inheritance.ex1;

public class Eagle extends Bird {

	public Eagle(String name, String color) {
		super(name, color);
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getColor() {
		return this.color;
	}

}
