package com.demo.Dao;

import java.util.List;

import com.demo.entity.Emp;
import com.demo.exceptions.EmpExistsException;
import com.demo.exceptions.EmpNotFounException;

public interface EmpDao {

	public Emp findById(Integer id) throws EmpNotFounException;
	public String save(Emp e) throws EmpExistsException;
	public String delete(Integer id)throws EmpNotFounException;
	public String update(Emp e)throws EmpNotFounException;
	public List<Emp> findAll();
}
