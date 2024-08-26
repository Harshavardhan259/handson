package com.demo.threads.sync;

public class TableWorker implements Runnable{
	private TableGenerator tableGenerator;
	int x;

	

	public TableWorker(TableGenerator tableGenerator, int x) {
		this.tableGenerator = tableGenerator;
		this.x = x;
	}
	
	public void run() {
		String name =Thread.currentThread().getName();
		System.out.println("thread "+name+" started");
		
		tableGenerator.genTable(x);
		
	}

}
