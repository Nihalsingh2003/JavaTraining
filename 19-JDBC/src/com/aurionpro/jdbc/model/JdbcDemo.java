package com.aurionpro.jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo {
	public static void main(String[] args) throws Exception {
		// register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Create Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DEMO", "root",
				"Nihal@9363");
		System.out.println("DataBase is Connected");

		// create SQL statement
//		String insertQuery = "insert into student(id,name,age)values(?,?,?)";
//		PreparedStatement ps = connection.prepareStatement(insertQuery);
//
//		ps.setInt(1, 100);
//		ps.setString(2, "Nihal");
//		ps.setInt(3, 21);
//
//		ps.execute();
//		System.out.println("data inserted.");

		// Display data from db
//		String displayQuery = "select * from student";
//		PreparedStatement ps = connection.prepareStatement(displayQuery);
//
//		ResultSet rs = ps.executeQuery();
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt("id")+" - "+ rs.getString("name")+" - "+rs.getInt("age"));
//		}
		
		//upadte data from db
//		String updateQuery = "update student set name=? where id=?";
//		PreparedStatement ps = connection.prepareStatement(updateQuery);
//		
//		ps.setString(1, "singh");
//		ps.setInt(2, 100);
//		ps.execute();
//		System.out.println("Data has been updated!");
		
		//delete data from db
		String deleteQuery = "delete from student  where id=?";
		PreparedStatement ps = connection.prepareStatement(deleteQuery);
		ps.setInt(1, 100);
		ps.execute();
		System.out.println("Data has been deleted!");
		
		

	}

}
