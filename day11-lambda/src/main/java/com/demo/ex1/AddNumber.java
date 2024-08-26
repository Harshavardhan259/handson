package com.demo.ex1;

public class AddNumber <T>{
	T num1;
	T num2;
	
	
	
	public AddNumber(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public  String concat(){
		return num1+" "+num2;
	}

	public static void main(String[] args) {
		AddNumber<Integer> a1 = new AddNumber<>(6, 7);
		System.out.println(a1.concat());
		AddNumber<String> a2 = new AddNumber<>("fname", "lname");
		System.out.println(a2.concat());
		
	}

}
