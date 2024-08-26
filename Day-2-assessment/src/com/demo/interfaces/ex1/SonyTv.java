package com.demo.interfaces.ex1;

public class SonyTv implements TvRemote{

	@Override
	public void switchOn() {
		System.out.println("SonyTv is switchOn");
		
	}

	@Override
	public void switchOff() {
		System.out.println("SonyTv is switchOn");
		
	}

	@Override
	public void setChannel(int ch) {
		System.out.println("SonyTv channel number is:"+ch);
		
	}
	

}
