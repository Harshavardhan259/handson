package com.demo.application;

public class EmployeeService {
	
		private EmpDAo empdao = new EmpDAo();
		
	public String registerEmployee(int id, String name, double salary, String doorNo, String city, int pinCode) {
//create and object of Employee with Address
//Use Persistecelayer EmpDao to save the data (just SOP).

		Address address = new Address("18d", "belgaum", 1234);
		Employee emp =new Employee(1, "harsh", address , 100);
		String response = empdao.save(emp);
		return response;
		
		
	}


}
