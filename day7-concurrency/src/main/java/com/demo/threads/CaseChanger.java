package com.demo.threads;

import java.util.concurrent.Callable;

public class CaseChanger implements Callable<String>{

	private String name;
	
	public CaseChanger(String name) {
		this.name = name;
	}
	public String call() throws Exception {
		String name1 =Thread.currentThread().getName();
		System.out.println("thread "+name1+"started");
		return name.toLowerCase();
	}

}
