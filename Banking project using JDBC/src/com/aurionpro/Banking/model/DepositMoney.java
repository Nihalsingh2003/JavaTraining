package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepositMoney {
	public static void depositMoney(int accountId, double amount, Connection connection) {
		if (!AccountExist.accountExists(connection, accountId)) {
			System.out.println(" Account does not exist.");
			return;
		}
		if (amount < 0) {
			System.out.println("Invalid amount. Deposit amount must be greater than zero.");
			return;
		}
		String addQuery = "UPDATE account SET balance = balance + ? WHERE account_id = ?";
		try (PreparedStatement ps = connection.prepareStatement(addQuery)) {
			connection.setAutoCommit(false);
			ps.setDouble(1, amount);
			ps.setInt(2, accountId);
			ps.executeUpdate();
			EnterTransactionHistory.enterTransactionHistory(null, accountId, amount, "Deposit", connection);
			connection.commit();
			System.out.println("Deposit of " + amount + " to account " + accountId + " successful.");

		} catch (SQLException e) {
			try {
				connection.rollback();
				System.out.println("Deposit failed. Transaction rolled back.");
			} catch (SQLException rollbackEx) {
				System.out.println("Rollback failed.");
				rollbackEx.printStackTrace();
			}
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				System.out.println("Failed to reset auto-commit.");
			}
		}

	}
}
