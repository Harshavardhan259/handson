package com.demo.banks;

public class MainBank {

	public static void main(String[] args) {
		
		PersonalLoans p =new PersonalLoans("15%", 50000, 12, "Jonh");
		HomeLoans h = new HomeLoans("10%", 250000, 12, "Jonh");
		
		System.out.println(+p.getLoanAmount()+" "+p.getLoanAmount()+" "+p.getMonths()+" "+p.getPersonName());
		System.out.println(+h.getLoanAmount()+" "+h.getLoanAmount()+" "+h.getMonths()+" "+h.getPersonName());
	}

}
