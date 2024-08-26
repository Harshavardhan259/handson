package com.demo.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculation {
	
	@Test
	public void testCalculation() {
		MyCalculation cal= new MyCalculation();
		cal.calculation();
		Assertions.assertEquals(40, cal.add);
		Assertions.assertEquals(20, cal.sub);
		Assertions.assertEquals(300, cal.mul);
		Assertions.assertEquals(3, cal.divide);
		
	}

}
