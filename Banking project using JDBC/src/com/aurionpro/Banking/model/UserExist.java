package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserExist {

    public static boolean userExists(Connection connection, int userId, String pin) {
        String query;

       
        if (pin == null) {
            query = "SELECT user_id FROM user WHERE user_id = ?";
        } else {
            query = "SELECT user_id FROM user WHERE user_id = ? AND user_pin = ?";
        }

        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, userId);
            if (pin != null) {
                ps.setString(2, pin);
            }

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); 
            }

        } catch (SQLException e) {
            System.out.println("Database error while checking user existence: " + e.getMessage());
        }

        return false;
    }
}
