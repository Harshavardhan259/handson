package com.demo.spring;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		ObjectMapper objectMapper =new ObjectMapper();
		
		Emp emp = new Emp(100,"Jhon","Bangalore",6400.0);
		
		String jsonData = objectMapper.writeValueAsString(emp);
		System.out.println(jsonData);
		
		//String jsonString ="{\"empId\":100,\"name\":\"Jhon"\,}""
	}

}
