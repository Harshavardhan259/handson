package com.demo.threads;

public class Main2 {

	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(new MyrunnebleWorker());
		Thread t2 = new Thread(new MyrunnebleWorker());

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}

}
