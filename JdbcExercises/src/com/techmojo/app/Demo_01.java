package com.techmojo.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_01 {

	public static void main(String[] args) {
		String url = "jdbc:derby:memory:demoDb;create=true";
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection con = DriverManager.getConnection(url);
			
			String sql1 = "CREATE TABLE Student(id int, "
					+ "name varchar(40), "
					+ "email varchar(40))";
			String sql2 = "INSERT INTO Student values("
					+ "101,"
					+ "'Yoda',"
					+ "'yoda@jedi.com')";
			String sql3 = "SELECT * FROM Student";
			
			Statement stmt = con.createStatement();
			stmt.execute(sql1);
			System.out.println("Created");
			stmt.executeUpdate(sql2);
			System.out.println("Inserted row");
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
