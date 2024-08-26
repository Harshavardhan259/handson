package com.demo.templet.ex1;

public interface Game2 {
	
	public  void initGame();
	public  void start();
	public  void end();
	
	default public void play() {
		initGame();
		start();
		end();
	}

}

class Mario2 implements Game2{

	@Override
	public void initGame() {
		System.out.println("Mario is Loading...");
		
	}

	@Override
	public void start() {
		System.out.println("Mario is starting ...");
		
	}

	@Override
	public void end() {
		System.out.println("Thank you Mario is ending...");
		
	}
	
}

class Pubg2 implements Game2{
	@Override
	public void initGame() {
		System.out.println("Pubg is Loading...");
		
	}

	@Override
	public void start() {
		System.out.println("Pubg is starting ...");
		
	}

	@Override
	public void end() {
		System.out.println("Thank you Pubg is ending ...");
		
	}
	
	
}
