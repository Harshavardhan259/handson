package com.demo.threads.pc;

public class Producer implements Runnable {
	private SharedQueue queue;
	private int count=0;
	
	@Override
	public void run() {
		try {
			while(true) {
				queue.put(count);
				Thread.sleep(200);
				count++;
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public Producer(SharedQueue queue) {
		this.queue = queue;
	}
	

}
