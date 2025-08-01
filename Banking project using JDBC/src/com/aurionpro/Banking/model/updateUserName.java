package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateUserName {
	public static void update(Connection connection, String newName, int userId) {
		String updateQuery = "UPDATE user SET user_name = ? WHERE user_id = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setString(1, newName);
			ps.setInt(2, userId);
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Name has been updated to: " + newName);
			} else {
				System.out.println("User not found.");
			}
		} catch (SQLException e) {
			System.out.println("Smoething Went wrong please check query");

		}
	}
}
