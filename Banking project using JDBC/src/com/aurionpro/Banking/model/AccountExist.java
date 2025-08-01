package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountExist {
	public static boolean accountExists(Connection connection, int accountId) {
		String query = "SELECT account_id FROM account WHERE account_id = ?";

		try (PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setInt(1, accountId);
			try (ResultSet rs = ps.executeQuery()) {
				return rs.next();
			}
		} catch (SQLException e) {
			System.out.println("Database error while checking account existence: ");
		}
		return false;
	}
}
