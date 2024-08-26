package com.demo.factory.ex2;



public class BirdMain {

	public static void main(String[] args) {
		Bird c = new BirdFactory().getBird("sparrow");
		
		System.out.println(c.getBirdDetails());


	}

}
