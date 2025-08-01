package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aurionpro.Banking.exception.DatabaseException;

public class WithdrawMoney {
	public static void withdrawMoney(int accountId, double amount, Connection connection) {
		if (!AccountExist.accountExists(connection, accountId)) {
			System.out.println(" Account does not exist.");
			return;
		}
		double balance = 0;
		try {
			balance = CheckBalance.checkBalance(accountId, connection);
		} catch (DatabaseException e) {
			System.out.println("Database error while checking account existence: ");

		}
		if (balance < amount) {
			System.out.println("Insufficient balance. Please enter a lower amount or check your account balance.");
			return;
		}
		String deductQuery = "UPDATE account SET balance = balance - ? WHERE account_id = ?";
		try (PreparedStatement ps = connection.prepareStatement(deductQuery)) {
			connection.setAutoCommit(false);
			ps.setDouble(1, amount);
			ps.setInt(2, accountId);
			ps.executeUpdate();
			EnterTransactionHistory.enterTransactionHistory(accountId, null, amount, "Withdraw", connection);

			connection.commit();
			System.out.println("Withdrawal of " + amount + " from account " + accountId + " successful.");

		} catch (SQLException e) {
			try {
				connection.rollback();
				System.out.println("withdrawMoney failed. Transaction rolled back.");
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
