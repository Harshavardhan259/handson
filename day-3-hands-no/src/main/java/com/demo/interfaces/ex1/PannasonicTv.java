package com.demo.interfaces.ex1;

public class PannasonicTv implements UniversalRemote{

	@Override
	public void switchOn() {
		System.out.println("PannasonicTv is switchOn");
		
	}

	@Override
	public void switchOff() {
		System.out.println("PannasonicTv is switchOff");
		
	}

	@Override
	public void setChannel(int ch) {
		System.out.println("PannasonicTv channel number is:"+ch);
		
	}
	

}