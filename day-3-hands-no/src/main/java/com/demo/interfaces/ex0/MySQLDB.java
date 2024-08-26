package com.demo.interfaces.ex0;

public class MySQLDB implements MyConnection{

	@Override
	public String getConnectionInfo() {
		return "MySQLDB is Connected..";
	}

	@Override
	public String getDBDtails() {
		return "MySQLDB 8.1.0";
	}
	

}