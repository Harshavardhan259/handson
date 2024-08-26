package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOfString {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("johnny","peter","monika","zeeta","andrew","srinivas","rinku","harry","peterson");

		//find all name having lenght more than 6 chars
		//convert all the names to uppercase
		//calculate the lenght of each names and collect them in a list
		//add welcome to every name
		//sort all the names in ascending order
		
		System.out.println("all name having lenght more than 6 chars");
		names.stream().filter(x->x.length()>6).forEach(System.out::println);
		
		System.out.println("all the names to uppercase");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		List<Integer> l=names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(l);
		
		System.out.println("add welcome to every name");
		names.stream().peek(s->System.out.print("welcome  ")).forEach(System.out::println);
		System.out.println("=========");
		System.out.println("sorted all the names in ascending order");
		names.stream().sorted().forEach(System.out::println);
		
	}

}
