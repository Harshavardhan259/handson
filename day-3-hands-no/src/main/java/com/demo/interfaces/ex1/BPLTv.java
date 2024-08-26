package com.demo.interfaces.ex1;

public class BPLTv implements UniversalRemote{

	@Override
	public void switchOn() {
		System.out.println("BPLTv is switchOn");
		
	}

	@Override
	public void switchOff() {
		System.out.println("BPLTv is switchOff");
		
	}

	@Override
	public void setChannel(int ch) {
		System.out.println("BPLTv channel number is:"+ch);
		
	}
	

}
