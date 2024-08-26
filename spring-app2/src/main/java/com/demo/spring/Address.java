package com.demo.spring;

public class Address {
	public String city;

	public Address() {
		
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return city;
	}
	
}
