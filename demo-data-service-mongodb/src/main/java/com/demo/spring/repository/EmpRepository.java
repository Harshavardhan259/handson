package com.demo.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.entity.Emp;

public interface EmpRepository extends MongoRepository<Emp, String> {

	@Query("UPDATE e from Emp e set.salary=:salary where e._id=:empId")
	@Transactional
	public int updateSalary(String empId , Double salary) ;
}
