package com.demo.chain.of.responsibility.ex1;



abstract class LoanApprover{
	protected double baseAmount=10000;
	LoanApprover successor;
	
	public void setSuccessor(LoanApprover successor) {
		this.successor=successor;
	}
	public abstract void approceLoan(double amount);
	
}

class Clerk extends LoanApprover{

	@Override
	public void approceLoan(double amount) {
		if(amount<baseAmount) {
			System.out.println("Your Loan approved..");
		}else if(successor!=null) {
			System.out.println("Request sent to manager");
			successor.approceLoan(amount);
		}
		
	}
	
}
class Manager extends LoanApprover{

	@Override
	public void approceLoan(double amount) {
		if(amount<baseAmount*10) {
			System.out.println("Your Loan approved..");
		}else if(successor!=null) {
			System.out.println("Request sent to Director");
			successor.approceLoan(amount);
		}
		
	}
	
}
class Director extends LoanApprover{

	@Override
	public void approceLoan(double amount) {
		if(amount<baseAmount*20) {
			System.out.println("Your Loan approved..");
		}else if(successor!=null) {
			System.out.println("Request sent to President");
			successor.approceLoan(amount);
		}
		
	}
	
}
class President extends LoanApprover{

	@Override
	public void approceLoan(double amount) {
		if(amount<baseAmount*30) {
			System.out.println("Your Loan approved..");
		}else if(successor!=null) {
			System.out.println("Request sent to Bord meeting");
			successor.approceLoan(amount);
		}
		
	}
	
}

class LoanApproverMain {

	public static void main(String[] args) {
		
		Clerk clerk = new Clerk();
		Manager manager =new Manager();
		Director director =new Director();
		President president = new President();
		
		clerk.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(president);
		//president.setSuccessor(president);
		
		clerk.approceLoan(500000);

	}

}
