package com.demo.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.spring.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp,Integer>{

	@Query("UPDATE Emp e set e.salary=:salary where empId=:empId")
	@Modifying
	@Transactional
	public int updateSalary(int empId , double  salary);
}
