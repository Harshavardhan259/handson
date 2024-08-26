package com.demo.singleton;

public class MySingleTon {
	
	private static MySingleTon singleton;
	
	private MySingleTon() {
		System.out.println("Singleton instantiated..");
		
	}
	
	public static MySingleTon instance() {
		if(singleton==null) {
			singleton = new MySingleTon();
			return singleton;
			
		}else {
			return singleton;
		}
	}

}
