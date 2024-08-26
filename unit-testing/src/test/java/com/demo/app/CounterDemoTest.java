package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CounterDemoTest {
	
	CounterDemo counter;
	
	@BeforeAll
	public void init() {
		counter = new CounterDemo();
	}
	
	@Test
	public void testIncrement2times() {
		counter.increment();
		counter.increment();
		assertEquals(2, counter.getCount());
		
	}
	
	@Test
	public void testDecrement2times() {
		counter.decrement();
		counter.decrement();
		assertEquals(-2, counter.getCount());
		
	}
	
	@AfterAll
	public void cleanup() {
		counter= null;
	}

}
