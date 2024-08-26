package com.demo.threads.pc;

public class Consumer implements Runnable {
	private SharedQueue queue;
	
	@Override
	public void run() {
		try {
			while(true) {
				queue.get();
				Thread.sleep(200);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public Consumer(SharedQueue queue) {
		this.queue = queue;
	}
	

}
