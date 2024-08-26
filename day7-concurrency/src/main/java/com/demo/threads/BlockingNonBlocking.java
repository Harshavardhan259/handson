package com.demo.threads;

public class BlockingNonBlocking {
	
	public static String greet() {
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "hello";
	}
	
	public static void main(String [] args) {
		
		//System.out.println(greet());
		
		new Thread(new Runnable() {
			
			public void run() {
				greet();
				
			}
		});
		
		System.out.println("Request completed...");
	}

}
