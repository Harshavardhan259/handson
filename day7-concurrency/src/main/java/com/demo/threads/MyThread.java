package com.demo.threads;

public class MyThread extends Thread{
	
	public void run() {
		String name =Thread.currentThread().getName();
		System.out.println("thread"+name+"started");
		try {
			for(int i =0;i<10;i++) {
				System.out.println("Executing from thread.."+name);
				Thread.sleep(2000);
				
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread"+name+"ended..");
	}

}
