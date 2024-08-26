package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Participant {

	private String name;
	@Autowired
	@Qualifier("participantList")
	private LunchBox lunchBox;
	
	public Participant() {
		
	}

	public Participant(String name, LunchBox lunchBox) {
		super();
		this.name = name;
		this.lunchBox = lunchBox;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LunchBox getLunchBox() {
		return lunchBox;
	}

	public void setLunchBox(LunchBox lunchBox) {
		this.lunchBox = lunchBox;
	}
	
	@Override
	public String toString() {
		return "Participant [name=" + name + ", lunchBox=" + lunchBox + "]";
	}
	
	
}
