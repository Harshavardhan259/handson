package com.demo.builder.ex1;



public class Email {
	private String setSentFrom;
	private String setSentTo;
	private String setSubject;
	private String setContent;
	
	public Email (EmailBuilder builder) {
		
		this.setSentFrom = builder.setSentFrom;
		this.setSentTo =builder.setSentTo;
		this.setSubject= builder.setSubject;
		this.setContent =builder.setContent;
		
	}

	 static class EmailBuilder {
		 private String setSentFrom;
			private String setSentTo;
			private String setSubject;
			private String setContent;
		
		
		
			EmailBuilder(String setSentFrom) {
			this.setSentFrom=setSentFrom;
			
		}
	 
		
	public EmailBuilder setSentFrom(String setSentFrom) {
		this.setSentFrom = setSentFrom;
		return this;
	}


	public EmailBuilder setSentTo(String setSentTo) {
		this.setSentTo = setSentTo;
		return this;
	}


	public EmailBuilder setSubject(String setSubject) {
		this.setSubject = setSubject;
		return this;
	}


	public EmailBuilder setContent(String setContent) {
		this.setContent = setContent;
		return this;
	}


		public Email build() {
			return new Email(this);
		}

	}
}

