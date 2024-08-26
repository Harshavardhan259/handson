package com.demo.templet.ex1;

public class TempletMain {

	public static void main(String[] args) {
		Game pubg = new Pubg();
		Game mario = new Mario();

		pubg.play();

		mario.play();

		Game2 pubg2 = new Pubg2();
		Game2 mario2 = new Mario2();

		pubg2.play();

		mario2.play();
	}

}
