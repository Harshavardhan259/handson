package com.demo.factory.ex2;

public interface Bird {
	public String getBirdDetails();

}

class Parrot implements Bird{

	public String getBirdDetails() {
		return "Bird is parrot";
	}
	
}

class Crow implements Bird{

	public String getBirdDetails() {
		return "Bird is Crow";
	}
	
}

class Peacock implements Bird{

	public String getBirdDetails() {
		return "Bird is Peacock";
	}
	
}
class Sparrow implements Bird{

	public String getBirdDetails() {
		return "Bird is Sparrow";
	}
	
}
