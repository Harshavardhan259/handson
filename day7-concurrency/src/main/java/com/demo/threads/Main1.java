package com.demo.threads;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		String name =Thread.currentThread().getName();
		System.out.println("thread"+name+"started");
		
		
		System.out.println(Thread.currentThread());
		MyThread t1 = new MyThread();
		t1.setName("john");
		t1.start();
		
		
		
		t1.run();
		MyThread t2 = new MyThread();
		t2.setName("peter");
		t2.start();
		
		
		t1.join();
		t2.join();
		
		//t2.run();
		System.out.println("thread"+name+"ended..");
	}

}
