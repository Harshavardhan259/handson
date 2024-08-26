package com.demo.computer;

public class Keyboard {
	private String brand;
	private String model;
	private String type;

	public Keyboard(String brand, String model, String type) {
		this.brand = brand;
		this.model = model;
		this.type = type;

	}

	public String getDetails() {
		return brand + " " + model+" "+type;
	}

}
