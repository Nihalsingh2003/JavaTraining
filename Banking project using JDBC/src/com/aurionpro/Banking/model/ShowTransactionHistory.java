package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ShowTransactionHistory {
	public static void showTransactionHistory(int accountId, Connection connection) {
		String query = "select * from transaction_history where senderAccount_id = ? or receiverAccount_id = ? order by transaction_date desc";

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, accountId);
			ps.setInt(2, accountId);
			ResultSet rs = ps.executeQuery();
			boolean hasResults = false;
			while (rs.next()) {
				hasResults=true;
				int sender = rs.getInt("senderAccount_id");
				int receiver = rs.getInt("receiverAccount_id");
				double amount = rs.getDouble("amount");
				String type = rs.getString("transaction_type");
				Timestamp date = rs.getTimestamp("transaction_date");

				if ("Transfer".equalsIgnoreCase(type)) {
					if (sender == accountId) {

						System.out.println("Transferred ₹" + amount + " from your account ID: " + sender + " to Account ID: "
								+ receiver + " on " + date + " | Type: Transfer");
					} else {

						System.out.println("Transferred ₹" + amount + " from Account ID: " + sender + " to your account"
								+ " on " + date + " | Type: Transfer");
					}
				} else if ("Deposit".equalsIgnoreCase(type)) {
					System.out.println("Deposited ₹" + amount + " into your account on " + date + " | Type: Deposit");
				} else if ("Withdraw".equalsIgnoreCase(type)) {
					System.out.println("Withdrew ₹" + amount + " from your account on " + date + " | Type: Withdraw");
				} else {
					System.out.println("Transaction of ₹" + amount + " on " + date + " | Type: " + type);
				}

			}
			if (!hasResults) {
			    System.out.println("No Transaction records found.");
			}

		} catch (SQLException e) {
			System.out.println("Error retrieving transaction history: " + e.getMessage());

		}
	}

}
