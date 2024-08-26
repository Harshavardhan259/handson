package com.demo.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchPersonApp {

	public static void main(String[] args) {
		List<Person> personList =new ArrayList<>();
		personList.add(new Person(1, "harsh", "belgaum"));
		personList.add(new Person(2, "dheeraj", "pune"));
		personList.add(new Person(3, "harish", "bagalkot"));
		personList.add(new Person(4, "itappa", "atni"));
		personList.add(new Person(5, "ashish", "`bhoj"));
		personList.add(new Person(6, "subham", "bengalore"));
		personList.add(new Person(7, "sankalp", "bhoj"));
		personList.add(new Person(8, "devaraj", "belgaum"));
		personList.add(new Person(9, "sourabh", "nippani"));
		personList.add(new Person(10, "prajwal", "atni"));
		personList.add(new Person(11, "kishore", "belgaum"));
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter person id");
		int id = in.nextInt();
		int count=0;
		for(Person i:personList) {
			if(id==i.getId()) {
				System.out.println(i.getDetails());
				count++;
				break;
				
			}
		}if(count==0){
			System.out.println("person not exit..");
		}
		in.close();
		
		

	}

}
