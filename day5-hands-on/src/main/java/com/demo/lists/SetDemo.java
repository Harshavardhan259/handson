package com.demo.lists;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<String> nameSet  = new HashSet<>();
		SortedSet<String> nameSet  = new TreeSet<>();
		
		//List<String> namesList =new ArrayList<>();
		nameSet.add("john");
		nameSet.add("peter");
		nameSet.add("dheeraj");
		nameSet.add("harish");
		//nameSet.add(0, "itappa");
		//nameSet.remove(2);
		System.out.println(nameSet);
		System.out.println(nameSet.contains("peter"));
		nameSet.add("harish");
		System.out.println(nameSet.size());
		//System.out.println(nameSet.get(3));
		
		//namesList.clear();
		System.out.println(nameSet);
		
		//old approach
		
		Iterator<String> itr =nameSet.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		for(String name:nameSet) {
			System.out.println(name);
		}

	}

}
