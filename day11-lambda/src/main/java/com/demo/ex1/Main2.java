package com.demo.ex1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {

	public static  void main(String[] args) {
		//Predicate <Integer> p=(Integer t)->t>10;
		Predicate <Integer> p= t->t>10;
		System.out.println(p.test(29));
		
		//Consumer<String> c=(t)->System.out.println(t);
		Consumer<String> c=t->System.out.println(t);
		
		Supplier<String> s=()->"harsh";
		
		//Function<String , String> f=(name)->"hello"+name;
		Function<String , String> f=name->"hello"+name;
	}

}
