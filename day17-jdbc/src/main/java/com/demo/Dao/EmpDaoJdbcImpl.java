package com.demo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.entity.Emp;
import com.demo.exceptions.EmpExistsException;
import com.demo.exceptions.EmpNotFounException;

public class EmpDaoJdbcImpl implements EmpDao {

	@Override
	public Emp findById(Integer id) throws EmpNotFounException {
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from employee where empno=?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Emp emp = new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
						rs.getDouble("SALARY"));
				return emp;
			} else {
				throw new EmpNotFounException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		} catch (EmpNotFounException e) {
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException sql) {
				sql.printStackTrace();
			}

		}

	}

	@Override
	public String save(Emp e) throws EmpExistsException {
		try {
			try {
				Emp e1 = findById(e.getEmpId());

				throw new EmpExistsException();
			} catch (EmpNotFounException e1) {
				Connection conn = getConnection();
				PreparedStatement pst = conn
						.prepareStatement("insert into employee(empno,name,address,salary) value (?,?,?,?)");
				pst.setInt(1, e.getEmpId());
				pst.setString(2, e.getName());
				pst.setString(3, e.getCity());
				pst.setDouble(4, e.getSalary());

				int row = pst.executeUpdate();
				return "Employee date is saved";

			}

		} catch (SQLException e1) {
			e1.printStackTrace();
			throw new RuntimeException(e1);

		} catch (EmpExistsException e1) {
			throw e1;
		}

	}

	@Override
	public String delete(Integer id) throws EmpNotFounException {
		Connection conn = null;
		try {

			try {
				Emp emp = findById(id);

				conn = getConnection();
				PreparedStatement pst = conn.prepareStatement("delete from employee where empno=?");
				pst.setInt(1, id);
				int row = pst.executeUpdate();
				return "employee data is deleted" + row;

			} catch (EmpNotFounException e) {
				throw new EmpNotFounException();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);

		} catch (EmpNotFounException e) {
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException sql) {
				sql.printStackTrace();
			}

		}

	}

	@Override
	public String update(Emp e) throws EmpNotFounException {
		Connection conn = null;
		try {
			try {
				Emp emp = findById(e.getEmpId());
				conn = getConnection();
				PreparedStatement pst = conn
						.prepareStatement("update employee set name=?,address=?,salary=? where empno=?");
				pst.setString(1, e.getName());
				pst.setString(2, e.getCity());
				pst.setDouble(3, e.getSalary());
				pst.setInt(4, e.getEmpId());

				int row = pst.executeUpdate();
				return "Row is updated" + row;

			} catch (EmpNotFounException e2) {
				throw new EmpNotFounException();
			}

		} catch (SQLException e2) {
			e2.printStackTrace();
			throw new RuntimeException(e2);
		} catch (EmpNotFounException e2) {
			throw e2;
		}

	}

	@Override
	public List<Emp> findAll() {
		Connection conn = null;
		List<Emp> empList = new ArrayList<>();
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from employee");

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("EMPNO");
				String name = rs.getString("NAME");
				String city = rs.getString("ADDRESS");
				double salary = rs.getDouble("SALARY");

				empList.add(new Emp(id, name, city, salary));
			}

			return empList;

		} catch (SQLException e2) {
			e2.printStackTrace();
			throw new RuntimeException(e2);
		}
	}

	public Connection getConnection() throws SQLException {
		final String JDBC_URL = "jdbc:mariadb://localhost:3306/sapientdb";
		Connection conn = null;
		try {

			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection(JDBC_URL, "root", "root");
			return conn;

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new SQLException("Connection could not be created..");

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}

	}

}
