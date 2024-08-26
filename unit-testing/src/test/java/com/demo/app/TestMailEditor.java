package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class TestMailEditor {
	MailEditor mailEditor = new MailEditor();

	Mail mail= mailEditor.compose("john@gmail.com", "peter@gmail.com", "meeting", "be present at 5:00pm today");
	@Test 
	public void testmailEditor() {
		
		assertEquals("peter@gmail.com",mail.getFromAddress());
		mail.setToAddress("peter@gmail.com");
		assertEquals("peter@gmail.com", mail.getToAddress());
		
	}
	@Test
	public void testgetMessage() {
		
		assertEquals("be present at 5:00pm today", mail.getMessage().getBody());
	}

	
}
