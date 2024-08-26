package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	Emp emp;
	@Autowired
	EmpDao dao;
	
	public String registerEmp(int id, String name, String city, double sal) {
		emp= new Emp(id, name, city, sal);
		
		return dao.save(emp);
	}

}
