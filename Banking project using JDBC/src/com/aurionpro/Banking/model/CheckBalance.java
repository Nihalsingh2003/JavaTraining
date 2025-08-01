package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aurionpro.Banking.exception.DatabaseException;

public class CheckBalance {

	public static double checkBalance(int accountId, Connection connection) throws DatabaseException {
		String query = "SELECT balance FROM account WHERE account_id = ?";

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, accountId);

			try (ResultSet result = ps.executeQuery()) {
				if (result.next()) {
					return result.getDouble("balance");
				} else {
					System.out.println("⚠️ No account found with ID: " + accountId);
					return 0.0;
				}
			}
		} catch (SQLException e) {
			throw new DatabaseException("Failed to fetch balance. Check the SQL query!", e);
		}
	}
}
