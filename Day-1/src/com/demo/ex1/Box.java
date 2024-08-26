package com.demo.ex1;

public class Box {
	private int lenght;
	private int breadth;
	private int height;
	private String color="colourless";
	private double weight;
	
	public Box(int lenght, int breadth, int height) {
		this.lenght=lenght;
		this.breadth=breadth;
		this.height=height;
	}
	
	public Box(int lenght, int breadth, int height, String color) {
		this(lenght,breadth,height);
		this.color=color;
	}
	public Box(int lenght, int breadth, int height, String color, double weight){
		this(lenght,breadth,height,color);
		this.weight=weight;
		
	}
	
	public double getValume() {
		double vol=lenght*breadth*height;
		return vol;
	}
	
	public String getColor() {
		return this.color;
	}
	public double getWeight() {
		return this.weight;
	}
	
}
