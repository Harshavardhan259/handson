package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class Emp {

	private Integer empId;
	private String name;
	private String address;
	private Double salary;
	
	public Emp() {
		
	}

	public Emp(Integer empId, String name, String address, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String toString() {
		return empId+" "+name+" "+address+" "+salary;
	}
	
}