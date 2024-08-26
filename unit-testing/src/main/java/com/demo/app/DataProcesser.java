package com.demo.app;

import java.util.List;

public class DataProcesser extends Thread{
	
	private List<Data> dataList;
	private int start;
	public DataProcesser(List<Data> dataList, int start) {
		this.dataList = dataList;
		this.start = start;
	}
	
	public void run() {
		for(int i=start;i<start+5;i++) {
			Data d= dataList.get(i);
			int num= d.getNumber();
			d.setSquare(square(i+2));
			
			
		}
	}
	int square(int i) {
		return i*i;
	}

}
