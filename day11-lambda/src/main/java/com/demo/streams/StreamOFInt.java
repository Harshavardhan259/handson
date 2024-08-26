package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOFInt {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(2,5,3,4,6,7,54,76,67);
		//Predicate<Integer> testEven =(x)->x%2==0;
		
		System.out.println("evan number");
		numList.stream().filter((x)->x%2==0).forEach(System.out::println);
		
		//find all the add numbers and print
		System.out.println("\nodd number");
		numList.stream().filter((x)->x%2!=0).forEach(System.out::println);
		
		//find all the number>24
		System.out.println("\nnumber>24");
		numList.stream().filter((x)->x>24).forEach(System.out::println);
		
		List<Integer> evans =numList.stream().filter(x->x%2==0).collect(Collectors.toList());
		//long count= numList.stream().filter((x)->x%2==0).count();
		
		System.out.println("number of evan numbers:"+evans.stream().count());
		
		int sum = numList.stream().filter(x->x%2==0).mapToInt(x->x.intValue()).sum();
		
		System.out.println("sum of number:"+sum);
		
	}

}
