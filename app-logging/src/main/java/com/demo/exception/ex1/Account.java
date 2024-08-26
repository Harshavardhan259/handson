package com.demo.exception.ex1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Account {
	private double amount;
	
	private Logger LOGGER= LogManager.getLogger(this.getClass().getName());

	public Account() {
		LOGGER.info("AN Account Object is created");
	}
	
	public Account(double amount) {
		LOGGER.info("Account Balance updated");
		this.amount = amount;
	}

	public double getBalance() {
		return amount;
	}
	
	public double deposit(double damount) {
		amount=amount+damount;
		LOGGER.info("amount {}  deposited successfully",amount);
		return amount;
	}
	
	public double withdraw(double wamount) throws LowBalanceException{
		try {
			if(wamount>amount) {
				LOGGER.error("balance is low in the account");
				throw new LowBalanceException("Account has low balance");
			}else {
				amount=amount-wamount;
				LOGGER.info("Transaction successsfully");
				return amount;
			}
			
		}catch(LowBalanceException e) {
			LOGGER.error("withdraw is in error condition : {}",e.fillInStackTrace());
			throw new IllegalArgumentException(e);
		}
		
		
	}
	
	
	
	
}
