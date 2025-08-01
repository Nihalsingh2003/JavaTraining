package com.aurionopro.TransactionExample.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/JDBC_DEMO";
		String user = "root";
		String password = "Nihal@9363";

		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

			// Start transaction
			con.setAutoCommit(false);

			int withdrawAmount = 1000;
			PreparedStatement checkBalance = con.prepareStatement("SELECT balance FROM account WHERE id = ?");
			checkBalance.setInt(1, 21);
			ResultSet rs = checkBalance.executeQuery();

			if (rs.next()) {
				double balance = rs.getDouble("balance");
				System.out.println("Current balance: ₹" + balance);

				if (balance >= withdrawAmount) {
					PreparedStatement withdrawStmt = con
							.prepareStatement("UPDATE account SET balance = balance - ? WHERE id = ?");
					withdrawStmt.setDouble(1, withdrawAmount);
					withdrawStmt.setInt(2, 21);
					withdrawStmt.executeUpdate();

					System.out.println("Withdrawn ₹" + withdrawAmount);
				} else {
					System.out.println("Not enough balance.");
					con.rollback();
					return;
				}

			}

			PreparedStatement depositStmt = con
					.prepareStatement("UPDATE account SET balance = balance + ? WHERE id = ?");
			depositStmt.setDouble(1, withdrawAmount);
			depositStmt.setInt(2, 21);
			depositStmt.executeUpdate();

			// Commit transaction
			con.commit();
			System.out.println("✅ Transaction successful!" + withdrawAmount + " transferred.");

		} catch (Exception e) {
			System.out.println("⚠️ Error: " + e.getMessage());
			try {
				if (con != null) {
					con.rollback();
					System.out.println("⛔️ Transaction rolled back.");
				}
			} catch (SQLException rollbackEx) {
				rollbackEx.printStackTrace();
			}
		} finally {
			try {
				if (con != null && !con.isClosed())
					con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
