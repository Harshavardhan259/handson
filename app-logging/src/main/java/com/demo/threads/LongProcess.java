package com.demo.threads;

public class LongProcess {
	
	public void runLong() {
		try {
			while(true) {
				System.out.println("hello");
				Thread.sleep(500);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
