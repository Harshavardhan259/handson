package com.demo.spring;

public class EmpDTO {

	private Integer empId;
	private String name;
	private String city;
	private Double salary;
	
	public EmpDTO() {
		

	}

	public EmpDTO(Integer empID, String name, String city, Double salary) {
		super();
		this.empId = empID;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empID) {
		this.empId = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
