package com.demo.inheritance.ex1;

public class Student extends Person {
	private String grade;
	
	public Student(int id, String name, String location, String grade) {
		super(id,name,location);
		this.grade=grade;
	}
	public String getDetails() {
		return super.getDetails()+ " "+grade;
	}
}
