package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aurionpro.Banking.exception.DatabaseException;

public class TransferMoney {
	public static void transferMoney(int senderId, int receiverId, double amount, Connection connection) {
		if (senderId == receiverId) {
			System.out.println("Sender ID and Receiver ID cannot be the same. Please enter different IDs.");
			return;
		}

		if (!AccountExist.accountExists(connection, receiverId)) {
			System.out.println("Receiver account does not exist.");
			return;
		}
		double balance = 0;
		try {
			balance = CheckBalance.checkBalance(senderId, connection);
		} catch (DatabaseException e) {
			System.out.println("Database error while checking account existence: ");

		}
		if (balance < amount) {
			System.out.println("Insufficient balance. Please enter a lower amount or check your account balance.");
			return;
		}
		if (amount < 0) {
			System.out.println("Invalid amount. Transfer amount must be greater than zero.");
			return;
		}

		try {
			connection.setAutoCommit(false);
			// Deduct from sender
			String deductQuery = "UPDATE account SET balance = balance - ? WHERE account_id = ?";
			try (PreparedStatement ps = connection.prepareStatement(deductQuery)) {
				ps.setDouble(1, amount);
				ps.setInt(2, senderId);
				ps.executeUpdate();
			}

			String addQuery = "UPDATE account SET balance = balance + ? WHERE account_id = ?";
			try (PreparedStatement ps = connection.prepareStatement(addQuery)) {
				ps.setDouble(1, amount);
				ps.setInt(2, receiverId);
				ps.executeUpdate();
			}

			EnterTransactionHistory.enterTransactionHistory(senderId, receiverId, amount, "Transfer", connection);

			connection.commit();
			System.out.println("Transferred " + amount + " from account " + senderId + " to account " + receiverId
					+ " successfully.");

		} catch (SQLException e) {
			try {
				connection.rollback();
				System.out.println("Transfer failed. Transaction rolled back.");
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
