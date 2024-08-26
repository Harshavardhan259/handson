package com.demo.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletDemo {

	public static void main(String[] args) throws Exception {
		
		final String JDBC_URL="jdbc:mariadb://localhost:3306/sapientdb";
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(JDBC_URL, "root", "root");
		
		PreparedStatement pst = conn.prepareStatement("delete from employee where empno=?");
		
		pst.setInt(1, 106);
		
		
		int row = pst.executeUpdate();
		
		System.out.println("Rows Deleteds:"+row);

	}

}
