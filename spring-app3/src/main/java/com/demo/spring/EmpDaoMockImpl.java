package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoMockImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		System.out.println(e);
		return "Saved";
	}

}
