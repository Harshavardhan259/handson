package com.demo.interfaces.ex1;

public class InterfaceMain {

	public static void main(String[] args) {
		TvRemote u = new SonyTv();
		
		u.switchOn();
		u.switchOff();
		u.setChannel(20);
		
		UniversalRemote t = new Sharptv();
		t.switchOn();
		t.switchOff();
		t.setChannel(20);
		System.out.println("set channel numberis:"+t.getChannel());
	}

}
