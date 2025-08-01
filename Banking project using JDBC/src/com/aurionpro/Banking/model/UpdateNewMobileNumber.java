package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateNewMobileNumber {
	public static void update(Connection connection, String newMobileNo, int userId) {
		String updateQuery = "UPDATE user SET mobile_no = ? WHERE user_id = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setString(1, newMobileNo);
			ps.setInt(2, userId);
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Mobile No has been updated to: " + newMobileNo);
			} else {
				System.out.println("User not found.");
			}
		} catch (SQLException e) {
			System.out.println("Smoething Went wrong please check query");

		}
	}
}
