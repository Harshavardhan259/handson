package com.demo.app;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.demo.exception.ex1.Account;
import com.demo.exception.ex1.LowBalanceException;

public class TestThrows {
	
	@Test
	public void testLowbalanceException() {
		Account account = new Account(1000);
		LowBalanceException exception = assertThrows(LowBalanceException.class, ()->{account.withdraw(2000);});
		assertTrue(exception.getMessage().contains("Account has low balance"));
	}

}
