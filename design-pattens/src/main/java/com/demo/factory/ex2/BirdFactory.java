package com.demo.factory.ex2;



public class BirdFactory {
	
	public static Bird getBird(String input) {
		if(input.equals("parrot")) {
			return new Parrot();
		}else if(input.equals("Peacock")) {
			return new Peacock();
		}else if(input.equals("Crow")) {
			return new Crow();
			
		}else if(input.equals("sparrow")) {
			return new Sparrow();
		}else {
			throw new RuntimeException("bird not available");
		}
	}
}



