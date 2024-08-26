package com.demo.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	@Disabled
	public void testJupiterSetup() {
		System.out.println("Test Done");
		
	}
	
	@Test
	@DisplayName("Test the counter for 2 increments")
	public void testAddfor2ints() {
		Calculator cal = new Calculator();
		Assertions.assertEquals(6, cal.add(3,3));
	}
	@Test
	@DisplayName("Test the counter for 2 increments")
	public void testSubfor2ints() {
		Calculator cal = new Calculator();
		Assertions.assertEquals(4, cal.sub(8, 4));
	}
	@Test
	@DisplayName("Test the counter for 2 increments")
	public void testMultiplefor2ints() {
		Calculator cal = new Calculator();
		Assertions.assertEquals(16, cal.multi(4, 4));
	}
	@Test
	@DisplayName("Test the counter for 2 increments")
	public void testDividefor2ints() {
		Calculator cal = new Calculator();
		Assertions.assertEquals(2, cal.divid(4, 2));
	}
	
}
