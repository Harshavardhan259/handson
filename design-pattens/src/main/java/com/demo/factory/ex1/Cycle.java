package com.demo.factory.ex1;

public interface Cycle {
	
	public String getCycleDetailes();

}

class TriCycle implements Cycle{

	public String getCycleDetailes() {
		
		return "TriCycle with 3 wheels";
	}
	
}

class BiCycle implements Cycle{

	public String getCycleDetailes() {
		
		return "BiCycle with 2 wheels";
	}
	
}

class UniCycle implements Cycle{

	public String getCycleDetailes() {
		
		return "uniCycle with 1 wheels";
	}
	
}