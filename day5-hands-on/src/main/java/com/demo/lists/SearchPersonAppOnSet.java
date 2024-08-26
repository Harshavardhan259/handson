package com.demo.lists;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SearchPersonAppOnSet {

	public static void main(String[] args) {
		Set<Person> personSet =new HashSet<>();
		personSet.add(new Person(1, "harsh", "belgaum"));
		personSet.add(new Person(2, "dheeraj", "pune"));
		personSet.add(new Person(3, "harish", "bagalkot"));
		personSet.add(new Person(4, "itappa", "atni"));
		personSet.add(new Person(5, "ashish", "`bhoj"));
		personSet.add(new Person(6, "subham", "bengalore"));
		personSet.add(new Person(7, "sankalp", "bhoj"));
		personSet.add(new Person(8, "devaraj", "belgaum"));
		personSet.add(new Person(9, "sourabh", "nippani"));
		personSet.add(new Person(10, "prajwal", "atni"));
		personSet.add(new Person(8, "kishore", "belgaum"));
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter person id");
		int id = in.nextInt();
		int count=0;
		for(Person i:personSet) {
			if(id==i.getId()) {
				System.out.println(i.getDetails());
				count++;
				break;
				
			}
		}if(count==0){
			System.out.println("person not exit..");
		}
		in.close();
		
		System.out.println(personSet);
		
		SortedSet<Person> sortedperson = new TreeSet<>();
		System.out.println(sortedperson);

	}

}
