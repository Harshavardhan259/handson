package com.demo.app;

public class Main {

	public static void main(String[] args) {
		CounterDemo counterDemo = new CounterDemo();
		counterDemo.increment();
		counterDemo.decrement();
		
		System.out.println(counterDemo.getCount());

	}

}
