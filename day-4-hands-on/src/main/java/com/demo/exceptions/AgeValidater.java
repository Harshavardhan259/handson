package com.demo.exceptions;

public class AgeValidater {
	int age;
	
	public AgeValidater(int age) {
		this.age = age;
	}

	public String validateAge() throws InvalidAgeException{
		try {
		if(age<18) {
			throw new InvalidAgeException("children not allowed") ;
		}else if(age>60) {
			throw new InvalidAgeException("senior not allowed") ;
		}else {
			return "allowed";
		}
		
		}catch(InvalidAgeException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}
}
