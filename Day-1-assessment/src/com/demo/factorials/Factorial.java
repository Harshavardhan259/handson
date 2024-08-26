package com.demo.factorials;

public class Factorial {
	private int number;
	private int  fact=1;
	private int i=1;
	
	public Factorial(int number) {
		this.number = number;
	}

	public int getFactorialFor() {
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public int getFactorialWhile() {
		while(i<=number) {
			fact=fact*i;
			i++;
		}
		return fact;
	}
	
	
}
