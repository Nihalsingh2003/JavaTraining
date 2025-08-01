package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.aurionpro.Banking.exception.DatabaseException;

public class CreateNewAccount {

	public void newUserCreateAccount(int userId, String userName, String userMobileNo, double initialBalance,
			String userPin, String bankPin, Connection connection) throws DatabaseException {
		String checkUserQuery = "select user_id from user where user_id=?";
		String insertUserQuery = "INSERT INTO user(user_id, user_name, mobile_no,user_pin) VALUES (?, ?, ?,?)";
		String getLastAccountIdQuery = "SELECT MAX(account_id) FROM account";
		String insertAccountQuery = "INSERT INTO account(account_id, user_id, balance,account_pin) VALUES (?, ?, ?,?)";

		try {
			connection.setAutoCommit(false);

			int newAccountId = 100;

			// check for existing user
			try (PreparedStatement check = connection.prepareStatement(checkUserQuery)) {
				check.setInt(1, userId);

				try (ResultSet result = check.executeQuery()) {
					if (result.next() && result.getInt(1) > 0) {
						System.out.println("User with ID " + userId + " already exists.");
						return;
					}
				}
			}

			// Get the last account_id
			try (PreparedStatement ps = connection.prepareStatement(getLastAccountIdQuery);
					ResultSet rs = ps.executeQuery()) {
				if (rs.next() && rs.getInt(1) > 0) {
					newAccountId = rs.getInt(1) + 1;
				}
			}

			// Insert into user
			try (PreparedStatement user = connection.prepareStatement(insertUserQuery)) {
				user.setInt(1, userId);
				user.setString(2, userName);
				user.setString(3, userMobileNo);
				user.setString(4, userPin);
				user.executeUpdate();
			}

			// Insert into account
			try (PreparedStatement acc = connection.prepareStatement(insertAccountQuery)) {
				acc.setInt(1, newAccountId);
				acc.setInt(2, userId);
				acc.setDouble(3, initialBalance);
				acc.setString(4, bankPin);
				acc.executeUpdate();
			}

			connection.commit();
			System.out.println("------------------------------------------------------------------------");
			System.out.println("User and account created successfully. Account Number: " + newAccountId
					+ ", Initial balance: ₹" + initialBalance + ".\nNote: Your User ID " + userId
					+ " will be required to access banking operations. Please keep it safe.");

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException rollbackEx) {
				rollbackEx.printStackTrace();
			}
			throw new DatabaseException("Transaction failed. Rolling back.", e);
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				throw new DatabaseException("Error resetting auto-commit.", e);
			}
		}
	}

	public void ExistingUsercreateAccount(int userId, double initialBalance, String bankPin, Connection connection)
			throws DatabaseException {
		String checkUserQuery = "SELECT user_id FROM user WHERE user_id=?";
		String getLastAccountIdQuery = "SELECT MAX(account_id) FROM account";
		String insertAccountQuery = "INSERT INTO account(account_id, user_id, balance,account_pin) VALUES (?, ?, ?,?)";

		try {
			connection.setAutoCommit(false);
			int newAccountId = 100;
			boolean userExists = false;

			// Check if user exists
			try (PreparedStatement check = connection.prepareStatement(checkUserQuery)) {
				check.setInt(1, userId);
				try (ResultSet result = check.executeQuery()) {
					if (result.next()) {
						userExists = true;
					}
				}
			}

			if (!userExists) {
				System.out.println("No user exists with user ID " + userId + ". Please try again.");
				return;
			}

			// Get the last account_id
			try (PreparedStatement ps = connection.prepareStatement(getLastAccountIdQuery);
					ResultSet rs = ps.executeQuery()) {
				if (rs.next() && rs.getInt(1) > 0) {
					newAccountId = rs.getInt(1) + 1;
				}
			}

			// Insert new account for existing user
			try (PreparedStatement acc = connection.prepareStatement(insertAccountQuery)) {
				acc.setInt(1, newAccountId);
				acc.setInt(2, userId);
				acc.setDouble(3, initialBalance);
				acc.setString(4, bankPin);
				acc.executeUpdate();
			}

			connection.commit();
			System.out.println("New account created successfully for user ID " + userId + ". Account Number: "
					+ newAccountId + ", Initial balance: ₹" + initialBalance);

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException rollbackEx) {
				rollbackEx.printStackTrace();
			}
			throw new DatabaseException("Transaction failed. Rolling back.", e);
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (SQLException e) {
				throw new DatabaseException("Error resetting auto-commit.", e);
			}
		}
	}

}
