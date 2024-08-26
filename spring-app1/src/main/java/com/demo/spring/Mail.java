package com.demo.spring;

public class Mail {
	private String fromAddress;
	private String toAddress;
	private Message message;
	
	public Mail() {
		// TODO Auto-generated constructor stub
	}

	public Mail(String fromAddress, String toAddress, Message message) {
		super();
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.message = message;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
}
