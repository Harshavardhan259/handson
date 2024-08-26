package com.demo.interfaces.ex1;

public class InterfaceMain {

	public static void main(String[] args) {
		UniversalRemote u = new SonyTv();
		
		u.switchOn();
		u.switchOff();
		u.setChannel(20);

	}

}
