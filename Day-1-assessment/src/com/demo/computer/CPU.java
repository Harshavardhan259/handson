package com.demo.computer;

public class CPU {
	private String brand;
	private String model;
	private String speed;
	
	
	public CPU(String brand, String model, String speed) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}
	
	public String getDetails() {
		return brand+" "+model+" "+speed;
	}
	
}


