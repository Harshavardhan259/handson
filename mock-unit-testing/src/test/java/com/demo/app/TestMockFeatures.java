package com.demo.app;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestMockFeatures {
	
	@Test
	public void testListWithMock() {
		List<String> mockList=mock(List.class);
		
		mockList.add("a");
		mockList.add("b");
		
		verify(mockList, atLeastOnce()).add("b");
	}

}
