package com.demo.inheritance.ex1;

public class Main {
	
	public static void main(String[] args) {
		
		
		//Student s=new Student(1,"penny","belgaum","Excellent");
		
		//System.out.println(s.getDetails());
		
		Person peat = new Person(1,"peat","belagavi");
		Employee penny=new Employee(2,"penny","belgaum",50000);
		TraineeEmp peter=new TraineeEmp(3,"peter","bengalore",5000,"Good");
		
		
		System.out.println(peat.getDetails());
		System.out.println(penny.getDetails());
		System.out.println(peter.getDetails());
		
		peat=penny;
		System.out.println(peat.getDetails());
		peat=peter;
		System.out.println(peat.getDetails());
		System.out.println(peat);
		
	}

}
