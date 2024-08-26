package com.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmpLists {

	public static void main(String[] args) {
		List<Emp> db = new ArrayList<>();
		db.add(new Emp(100, "Shantanu", "Hyderabad", 35000));
		db.add(new Emp(101, "Pavan", "Hyderabad", 25000));
		db.add(new Emp(102, "Arun", "Chennai", 55000));
		db.add(new Emp(103, "Raja", "Chennai", 76000));
		db.add(new Emp(104, "Ranga", "Bangalore", 75000));
		db.add(new Emp(105, "Pretham", "Bangalore", 45000));
		db.add(new Emp(106, "Chandra", "Pune", 40000));
		db.add(new Emp(107, "Vamshi", "Pune", 25000));
		db.add(new Emp(108, "Dheeraj", "Pune", 25000));
		db.add(new Emp(109, "Ittapa", "Mumbai", 25000));

		//Stream<Emp> stream = db.stream();
		System.out.println(" List all the employees who stays in chennai and Hyderabad");
		db.stream().filter((x -> x.getCity().equals("Hyderabad") || x.getCity().equals("Chennai"))).forEach(System.out::println);
		// System.out.println(stream);
		System.out.println("List all the EMployees whos salary is >35000");
		db.stream().filter((x -> x.getSalary() > 35000)).forEach(System.out::println);

		System.out.println(" find out if the salary is <35000, add 5000 bonus and change city to some other city");
		db.stream().filter((x -> x.getSalary() < 35000)).peek(x -> x.setCity("Belgaum"))
				.peek(x -> x.setSalary(x.getSalary() + 5000)).forEach(System.out::println);

		System.out.println("Find how much salary is paid per month to all the 10 employees");
		db.stream().mapToDouble(x->x.getSalary()).forEach(System.out::println);

		
		System.out.println("add 1000 to each employee");
		db.stream().peek(x -> x.setSalary(x.getSalary() + 1000)).forEach(System.out::println);

	}

}
