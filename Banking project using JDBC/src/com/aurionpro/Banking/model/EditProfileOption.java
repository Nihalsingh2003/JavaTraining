package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.util.Scanner;

public class EditProfileOption {
	public static void editProfile(Scanner scanner, User isUser, Connection connection) {
		String choice;
		while (true) {
			System.out.println("\nPlease choose one option:");
			System.out.println("1.Show Profile");
			System.out.println("2.Edit Name");
			System.out.println("3.Edit Mobile Number");
			System.out.println("4.Back To menu");
			choice = scanner.nextLine().trim();

			switch (choice) {
			case "1":
				System.out.println("userId: " + isUser.getUserId());
				System.out.println("UserName: " + isUser.getName());
				System.out.println("Mobile Number: " + isUser.getMobileNo());
				break;
			case "2":
				System.out.println("Enter the new name to update:");
				String newName = scanner.nextLine().trim();

				if (newName.equalsIgnoreCase(isUser.getName())) {
					System.out.println("The new name is the same as the current name. No update performed.");
					break;
				}

				while (true) {
					System.out.println(
							"Are you sure you want to change the name to \"" + newName + "\"? (1. yes / 2. no)");
					String confirmation = scanner.nextLine().trim();

					if (confirmation.equals("1")) {
						updateUserName.update(connection, newName, isUser.getUserId());
						
					} else if (confirmation.equals("2")) {
						System.out.println("Name update canceled.");
					} else {
						System.out.println("Invalid input. Please enter 1 or 2.");
						continue;
					}
					break;
				}
				break;

			case "3":
				System.out.println("Enter The new Mobile Number to Update!");
				String newMobileNo = scanner.nextLine();
				if (newMobileNo.equalsIgnoreCase(isUser.getMobileNo())) {
					System.out.println("The new Mobile No is the same as the current Mobile No. No update performed.");
					break;
				}

				while (true) {
					System.out.println(
							"Are you sure you want to change the Mobile No to \"" + newMobileNo + "\"? (1.yes/ 2.no)");
					String confirmation = scanner.nextLine();
					if (confirmation.equals("1")) {
						UpdateNewMobileNumber.update(connection, newMobileNo, isUser.getUserId());
					} else {
						System.out.println("Mobile No update canceled.");
					}
					break;
				}
				break;
			case "4":
				break;
			default:
				System.out.println("Please select a correct option (1-3).");
				continue;
			}
			if ("4".equals(choice))
				break;

		}

	}
}
