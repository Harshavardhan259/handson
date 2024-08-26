package com.demo.banks;

public class PersonalLoans {
	private String percentages;
	private double loanAmount;
	private int months;
	private String personName;
	
	public PersonalLoans(String percentages, double loanAmount, int months, String personName) {
		this.percentages = percentages;
		this.loanAmount = loanAmount;
		this.months = months;
		this.personName = personName;
	}

	public String getPercentages() {
		return percentages;
	}

	public void setPercentages(String percentages) {
		this.percentages = percentages;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
}
