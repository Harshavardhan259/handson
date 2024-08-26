package com.demo.statics;

public class DukeMain {
	public static void main(String[] args) {
		Duke d1 =new Duke("jeany");
		Duke d2 =new Duke("teny");
		Duke d3 =new Duke("rony");
		Duke d4 =new Duke("penny");
		Duke d5 =new Duke("meny");
		
		System.out.println("Duke count ="+Duke.getCount());
		d1.getName();
		//Duke.getName();
		//static_methode
		
		Duke.getCount();
	}
}
