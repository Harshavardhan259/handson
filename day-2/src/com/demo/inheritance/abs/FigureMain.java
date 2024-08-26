package com.demo.inheritance.abs;

public class FigureMain {
	public static void main(String[] args) {
		Rectangle  r = new Rectangle(10,20);
		Triangle t =new Triangle(20, 30);
		Figure ref=r;
		System.out.println(ref.area());
		ref=t;
		System.out.println(ref.area());
	}
}
