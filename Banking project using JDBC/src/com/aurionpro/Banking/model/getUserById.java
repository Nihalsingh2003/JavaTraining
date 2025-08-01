package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.Banking.exception.DatabaseException;

public class getUserById {
	public User checkUserId(int userId,String userPin, Connection connection) throws DatabaseException {
		String checkUserIdQuery = """
				select *
				from user
				inner join account
				on user.user_id=account.user_id
				where user.user_id=? AND user_pin = ?;
						        """;

		try (PreparedStatement ps = connection.prepareStatement(checkUserIdQuery)) {
			ps.setInt(1, userId);
			ps.setString(2, userPin);

			try (ResultSet rs = ps.executeQuery()) {
				User user = null;
				List<Integer> accountIds = new ArrayList<>();

				while (rs.next()) {
					if (user == null) {
						String name = rs.getString("user_name"); 
						String mobileNo = rs.getString("mobile_no");
						user = new User(userId, name, mobileNo, accountIds);
					}

					int accountId = rs.getInt("account_id");
					accountIds.add(accountId);
				}

				return user; 
			}
		} catch (SQLException e) {
			throw new DatabaseException("Check the SQL query!", e);
		}
	}
}
