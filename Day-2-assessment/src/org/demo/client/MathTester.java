package org.demo.client;

import org.demo.tools.Calculator;

public class MathTester {

	public static void main(String[] args) {
		Calculator c = new Calculator(5, 6);
		
		System.out.println("addition is:"+c.add());
		System.out.println("substraction is:"+c.subtract());
		System.out.println("Multiplecation: "+c.multiply());
	}

}
