package com.demo.application;

public class EmpDAo {
	public String save(Employee emp) {
		System.out.println("Emp with saved with Id:"+emp.getEmpId());
		return "Emp saved";
	}

}
