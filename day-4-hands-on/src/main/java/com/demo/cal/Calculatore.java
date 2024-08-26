package com.demo.cal;

public class Calculatore {
		
		NumberGenarater n=new NumberGenarater();
		
		int a=n.getFirstNumber();
		int b= n.getSecondNumber();
		
		public int add () {
			return a+b;
			
		}
}
