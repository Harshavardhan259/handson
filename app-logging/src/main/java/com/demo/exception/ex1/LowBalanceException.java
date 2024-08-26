package com.demo.exception.ex1;

public class LowBalanceException extends Exception {
	public LowBalanceException() {

	}

	public LowBalanceException(String message) {
		super(message);
	}
	
	public String toString() {
		return this.getClass().getName()+" "+super.getMessage();
	}

}
