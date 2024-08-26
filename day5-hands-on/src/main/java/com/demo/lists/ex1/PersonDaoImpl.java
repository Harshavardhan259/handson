package com.demo.lists.ex1;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
	List<Person> personList;

	public PersonDaoImpl(List<Person> personlist) {
		this.personList = personlist;
	}

	@Override
	public com.demo.lists.ex1.Person findById(int id) {
		for(Person i:personList) {
			if(id==i.getId()) {
				return i;
			}
		}
		return null;
	}

	@Override
	public String savePerson(com.demo.lists.ex1.Person p) {
		personList.add(p);
		return "Added";
	}

	@Override
	public List<com.demo.lists.ex1.Person> listAllPersons() {
		return personList;
	}
	
}
