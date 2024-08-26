package com.demo.builder.ex1;

public class Light {
	
	public void switchOn() {
		System.out.println("Light is ON now");
	}
	
	public void switchOff() {
		System.out.println("Light is Off now");
	}
}

interface Command{
	public void execute();
	
}

class onCommand implements Command{
	Light light;

	public onCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		light.switchOn();
		
	}
	
}
class offCommand implements Command{
	Light light;

	public offCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		light.switchOff();
		
	}
	
}

class Remote{
	Command onCommand;
	Command offCommand;
	public Remote(Command onCommand, Command offCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	public void on() {
		onCommand.execute();
	}
	
	public void off() {
		offCommand.execute();
	}
}

class Client{
	public static void main(String[] args) {
		Light light= new Light();
		Command on= new onCommand(light);
		Command off = new offCommand(light);
		
		Remote remote = new Remote(on, off);
		
		remote.on();
		
		remote.off();
	}
}
