package com.demo.inheritance.ex1;

public class TraineeEmp extends Employee{
	private String performance;
	
	public TraineeEmp(int id, String name, String location, double salary, String performance) {
		super(id,name,location,salary);
		this.performance=performance;
		
	}
	public String getDetails() {
		return super.getDetails()+ " "+performance;
	}

}
