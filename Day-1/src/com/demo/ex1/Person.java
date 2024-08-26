package com.demo.ex1;

public class Person {
	int id;
	String name;
	String email;
	long mobile;
	
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Person(int id, String name, String email) {
		this(id,name);
		this.email=email;
	}
	public Person(int id, String name, String email, long mobile) {
		this(id,name,email);
		this.mobile=mobile;
	}
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
