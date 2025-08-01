package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/Bank";
	private static final String USER = "root";
	private static final String PASSWORD = "Nihal@9363";

	private static Connection connection = null;

	private DataBaseConnection() {

	}

	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database connection established successfully.");
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver not found: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Failed to connect to the database: " + e.getMessage());
		}

		return connection;
	}
}
