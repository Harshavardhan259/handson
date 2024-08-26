package com.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	@Qualifier("custName")
	private Name name;
	@Autowired
	private List<String> emails;

	public Customer() {
		
	}

	public Customer(Name name, List<String> emails) {
		super();
		this.name = name;
		this.emails = emails;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	
	
	
}
