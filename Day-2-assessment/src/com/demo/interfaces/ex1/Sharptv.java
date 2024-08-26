package com.demo.interfaces.ex1;

public class Sharptv implements UniversalRemote{
	private int ch;

	@Override
	public void switchOn() {
		System.out.println("Sharptv is switchOn");
		
	}

	@Override
	public void switchOff() {
		System.out.println("Sharptv is switchOff");
		
	}

	@Override
	public void setChannel(int ch) {
		this.ch=ch;
		System.out.println("Sharptv channel number is:"+ch);
		
	}

	@Override
	public int getChannel() {
		return  ch;
	}

}
