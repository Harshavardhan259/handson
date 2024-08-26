package com.demo.computer;

public class ComputerMain {

	public static void main(String[] args) {
		CPU c = new CPU("hp", "intel i5", "64hz");
		Moniter m = new Moniter("Dell", "vbook", "1440p");
		Mouse m1 = new Mouse("hp", "40dt");
		Keyboard k = new Keyboard("Asus", "vbook", "gaming");
		
		System.out.println("Cpu Details:"+c.getDetails());
		System.out.println("Moniter Details:"+m.getDetails());
		System.out.println("Mouse Details:"+m1.getDetails());
		System.out.println("keyboard Details:"+k.getDetails());
	}

}
