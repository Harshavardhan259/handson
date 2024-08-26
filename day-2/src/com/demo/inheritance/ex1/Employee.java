package com.demo.inheritance.ex1;

public class Employee extends Person{
	private double salary;
	
	public Employee(int id, String name, String location, double salary) {
		super(id,name,location);
		this.salary=salary;
		
	}
	public String getDetails() {
		return super.getDetails()+ " "+salary;
	}

}
