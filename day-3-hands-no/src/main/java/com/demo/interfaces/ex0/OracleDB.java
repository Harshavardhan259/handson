package com.demo.interfaces.ex0;

public class OracleDB implements MyConnection{

	@Override
	public String getConnectionInfo() {
		return "OracleDB is Connected..";
	}

	@Override
	public String getDBDtails() {
		return "OracleDB 8.1.0";
	}
	

}
