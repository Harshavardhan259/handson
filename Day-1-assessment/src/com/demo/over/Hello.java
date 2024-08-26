package com.demo.over;

public class Hello {
	private int i;

	public Hello(int i) {
		this.i = i;
	}
	
	public String hello(int i) {
		return "int i:"+i;
	}
	public String hello(byte i) {
		return "byte i:"+i;
	}
	public String hello(short i) {
		return "short i:"+i;
	}
	public String  hello(long i) {
		return "long i:"+i;
	}

}

