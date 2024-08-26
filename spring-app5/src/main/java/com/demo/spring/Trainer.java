package com.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Trainer {
	
	@Autowired
	private String name;
	@Autowired
	private List<Participant> participant;

	public Trainer() {
		
	}

	public Trainer(String name, List<Participant> participant) {
		super();
		this.name = name;
		this.participant = participant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Participant> getParticipant() {
		return participant;
	}

	public void setParticipant(List<Participant> participant) {
		this.participant = participant;
	}

	
	
	
	
}
