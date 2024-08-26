package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ThreadRunnuerTest {

	@Test 
	public void testThreadData() throws Exception{
		ThreadRunner threadrunner = new ThreadRunner();
		threadrunner.runThread();
		int num = threadrunner.getData().get(0).getNumber();
		int square = threadrunner.getData().get(0).getSquare();
		
		
		assertTrue(num * num == square);
		
	}
}
