package com.demo.interfaces.ex0;

public class MainInterface {

	public static void main(String[] args) {
		MyConnection m = new OracleDB();
		
		System.out.println(m.getConnectionInfo());
		System.out.println(m.getDBDtails());
		
		
	}

}
