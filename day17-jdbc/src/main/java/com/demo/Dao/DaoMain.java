package com.demo.Dao;

import com.demo.entity.Emp;

public class DaoMain {

	public static void main(String[] args) throws Exception {
		EmpDao dao= new EmpDaoJdbcImpl();
		Emp e = new Emp(122, "harish", "Belgaum", 56000);
		System.out.println(dao.save(e));
		
		Emp e1=dao.findById(121);
		System.out.println(e1.getName()+" "+e1.getSalary());
		System.out.println(dao.delete(121));
		
		Emp e2 = new Emp(104, "harish", "Belgaum", 56000);
		System.out.println(dao.update(e2));
		System.out.println(dao.findAll());
		

	}

}
