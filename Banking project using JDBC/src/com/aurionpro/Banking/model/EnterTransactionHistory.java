package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnterTransactionHistory {
	public static void enterTransactionHistory(Integer senderAccount_id, Integer receiverAccount_id, double amount,
			String transaction_type, Connection connection) {
		String query = "INSERT  INTO  transaction_history (senderAccount_id,receiverAccount_id,amount,transaction_type)values(?,?,?,?)";
		try (PreparedStatement ps = connection.prepareStatement(query)) {
			if (senderAccount_id != null) {
				ps.setInt(1, senderAccount_id);
			} else {
				ps.setNull(1, java.sql.Types.INTEGER);
			}

			if (receiverAccount_id != null) {
				ps.setInt(2, receiverAccount_id);
			} else {
				ps.setNull(2, java.sql.Types.INTEGER);
			}

			ps.setDouble(3, amount);
			ps.setString(4, transaction_type);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("something went wrong while adding the data into TransactionHistory");
		}
	}
}
