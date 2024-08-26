package com.demo.computer;

public class Moniter {
	private String brand;
	private String model;
	private String resolution;
	
	public Moniter(String brand, String model, String resolution) {
		this.brand = brand;
		this.model = model;
		this.resolution= resolution;
		
	}
	
	public String getDetails() {
		return brand+" "+model+" "+resolution;
	}
	
}
