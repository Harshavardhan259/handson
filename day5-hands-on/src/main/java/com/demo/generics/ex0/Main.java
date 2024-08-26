package com.demo.generics.ex0;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Glass<Juice> glass= new Glass<Juice>();
		glass.liquid = new Juice();
		
		
		Glass<Water> glass1= new Glass<Water>();
		glass1.liquid = new Water();
		
		Water water = glass1.liquid;
		
		List<String> list = new ArrayList<>();
		//list.add(123);
		//list.add(75);
		list.add("hello");
		
	}

}
