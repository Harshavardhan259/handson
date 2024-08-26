package com.demo.ex1;

import java.util.Arrays;
import java.util.List;

public class ForechWithLambda {

	public static void main(String[] args) {
		List<String> fruits= Arrays.asList("apple","banana","pear","orange","mango");
		
		//fruits.forEach(s->System.out.println(s));
		
		//fruits.forEach(System.out::println);
		
		ForechWithLambda l= new ForechWithLambda();
		
		fruits.forEach(l::print);
		
	}
	
	public void print(String s) {
		System.out.println(" " +s);
	}

}
