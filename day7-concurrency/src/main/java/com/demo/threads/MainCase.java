package com.demo.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class MainCase {

	public static void main(String[] args) throws Throwable {
		//CaseChanger casechanger =new CaseChanger("HARSH");
		
		
		ThreadPoolExecutor service = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		
		List<CaseChanger> thread =new ArrayList<>();
		thread.add(new CaseChanger("DHEERAJ"));
		thread.add(new CaseChanger("HSTAD"));
		thread.add(new CaseChanger("ITTAP"));
		thread.add(new CaseChanger("HARISH"));
		
		List<Future<String>> futureList=service.invokeAll(thread);
		
		System.out.println("call maded...");
		
		do {
			System.out.println("waiting for result");
			Thread.sleep(1000);
			
		}while(service.getCompletedTaskCount()<futureList.size());
		
		
		for(Future<String> f: futureList) {
			System.out.println(f.get());
		}
		
		//Future<?> future1= service.submit(new CaseChanger(casechanger.call()));
		
		//System.out.println(future1.get());
		service.shutdown();
		

	}

}
