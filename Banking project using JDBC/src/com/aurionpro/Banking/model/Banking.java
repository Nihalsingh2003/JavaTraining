package com.aurionpro.Banking.model;

import java.sql.Connection;
import java.sql.SQLSyntaxErrorException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.Banking.exception.DatabaseException;

public class Banking {

	public void start() throws DatabaseException {
		Scanner scanner = new Scanner(System.in);
		Connection connection = DataBaseConnection.getConnection();

		if (connection == null) {
			System.err.println("Failed to obtain database connection. Exiting.");
			return;
		}

		System.out.println("Database connection acquired. Ready to process banking operations.");
		System.out.println("--------------------------------------------------------------------");

		while (true) {

			System.out.println("Please choose one option:");
			System.out.println("1. Create new account");
			System.out.println("2. Banking operation");
			System.out.println("3. Exit");

			String userInput = scanner.nextLine().trim();

			switch (userInput) {
			case "1":
				while (true) {
					System.out.println("\nPlease choose one option:");
					System.out.println("1. I am a new user and want to open my first bank account");
					System.out.println("2. I already have a user ID and want to open another bank account");
					System.out.println("3. Go back");

					String userInput1 = scanner.nextLine().trim();
					int userId;
					double initialBalance;
					boolean isUser;
					String userPin = null;
					String bankPin;
					String choice = null;
					switch (userInput1) {
					case "1":
//						scanner.nextLine();
						userId = getUserIdFromInput(scanner);

						isUser = UserExist.userExists(connection, userId, userPin);

						while (isUser) {
							System.out.println(" user already exists! Please try again !");
							System.out.println("Would you like to:");
							System.out.println("1. Try again");
							System.out.println("2. Go back to main menu");

							choice = scanner.nextLine();

							if (choice.equals("1")) {
								userId = getUserIdFromInput(scanner);
								isUser = UserExist.userExists(connection, userId, userPin);
							} else if (choice.equals("2")) {
								break;
							} else {
								System.out.println(" Invalid choice. Please enter 1 or 2.");
							}
						}

						if (choice != null) {
							if (choice.equals("2")) {
								break;
							}
						}
						while (true) {
							System.out.print("Create a 4-digit PIN for userAccount: ");
							userPin = scanner.nextLine();

							if (userPin.matches("\\d{4}")) {

								break;
							} else {
								System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
							}
						}
						System.out.print("Enter User Name: ");
						String userName = scanner.nextLine().trim();

						String mobileNo;
						while (true) {
							System.out.print("Enter Mobile Number: ");
							mobileNo = scanner.nextLine().trim();

							if (mobileNo.matches("\\d{10}")) {
								break;
							} else {
								System.out.println("Invalid mobile number. Please enter exactly 10 digits.");
							}
						}

						// Set bank account PIN
						while (true) {
							System.out.print("Create a 4-digit PIN for bankAccount: ");
							bankPin = scanner.nextLine();

							if (bankPin.matches("\\d{4}")) {
								break;
							} else {
								System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
							}
						}
						while (true) {
							try {
								System.out.print("Enter Initial Balance: ");
								initialBalance = scanner.nextDouble();

								if (initialBalance < 0) {
									System.out.println("Initial balance cannot be negative.");
									continue;
								}

								break;
							} catch (InputMismatchException e) {
								System.out.println("Please enter a valid number (e.g., 1000.00).");
								scanner.next();
							}
						}
						try {
							new CreateNewAccount().newUserCreateAccount(userId, userName, mobileNo, initialBalance,
									userPin, bankPin, connection);
						} catch (Exception e) {
							System.out.println("something went wrong please try again later!!");
						}

						scanner.nextLine();
						break;

					case "2":
//						

						userId = getUserIdFromInput(scanner);
						while (true) {
							System.out.print("Enter  4-digit PIN for userAccount: ");
							userPin = scanner.nextLine();

							if (userPin.matches("\\d{4}")) {

								break;
							} else {
								System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
							}
						}

						isUser = UserExist.userExists(connection, userId, userPin);

						while (!isUser) {
							System.out.println("No user exists! Please check and enter the correct userId and PIN.");
							System.out.println("Would you like to:");
							System.out.println("1. Try again");
							System.out.println("2. Go back to main menu");

							choice = scanner.nextLine();

							if (choice.equals("1")) {
								userId = getUserIdFromInput(scanner);
								while (true) {
									System.out.print("Enter 4-digit PIN for userAccount: ");
									userPin = scanner.nextLine();

									if (userPin.matches("\\d{4}")) {
										break;
									} else {
										System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
									}
								}

								isUser = UserExist.userExists(connection, userId, userPin);
							} else if (choice.equals("2")) {
								break;
							} else {
								System.out.println(" Invalid choice. Please enter 1 or 2.");
							}
						}

						if ("2".equals(choice)) {
							break;
						}

						// account PIN
						while (true) {
							System.out.print("Create a 4-digit PIN for New bankAccount: ");
							bankPin = scanner.nextLine();

							if (bankPin.matches("\\d{4}")) {
								break;
							} else {
								System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
							}
						}

						while (true) {
							try {
								System.out.print("Enter Initial Balance for The New bankAccount: ");
								initialBalance = scanner.nextDouble();

								if (initialBalance < 0) {
									System.out.println("Initial balance cannot be negative.");
									continue;
								}

								break;
							} catch (InputMismatchException e) {
								System.out.println("Please enter a valid number (e.g., 1000.00).");
								scanner.next();
							}
						}

						new CreateNewAccount().ExistingUsercreateAccount(userId, initialBalance, bankPin, connection);
						scanner.nextLine();
						break;

					case "3":

						System.out.println("Returning to main menu...");
						break;

					default:
						System.out.println("Please select a correct option (1-3).");
						continue;
					}

					if (userInput1.equals("3"))
						break;
				}
				break;

			case "2":
				System.out.println("Welcome to Bank!");
				String userPin = null;
				String bankPin;
				boolean accountVerify = true;
				boolean isAccountExist = false;
				String choice = null;
				User isUser;
				int userId = getUserIdFromInput(scanner);

				while (true) {
					System.out.print("Enter  4-digit PIN for userAccount: ");
					userPin = scanner.nextLine();

					if (userPin.matches("\\d{4}")) {

						break;
					} else {
						System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
					}
				}

				try {
					isUser = new getUserById().checkUserId(userId, userPin, connection);
				} catch (DatabaseException e) {
					System.out.println("Database error: " + e.getMessage());
					break;
				}

				while (isUser == null) {
					System.out.println("No user exists! Please try again with a correct user ID or Pin.");
					System.out.println("Would you like to:");
					System.out.println("1. Try again");
					System.out.println("2. Go back to main menu");

					choice = scanner.nextLine();

					if (choice.equals("1")) {
						userId = getUserIdFromInput(scanner);
						while (true) {
							System.out.print("Enter 4-digit PIN for userAccount: ");
							userPin = scanner.nextLine();

							if (userPin.matches("\\d{4}")) {
								break;
							} else {
								System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
							}
						}

						isUser = new getUserById().checkUserId(userId, userPin, connection);
					} else if (choice.equals("2")) {
						break;
					} else {
						System.out.println(" Invalid choice. Please enter 1 or 2.");
					}
				}
				if (isUser != null) {
					String input;
					System.out.println("_______________________________________________");
					System.out.println("User " + userId + " found! Access granted.");
					System.out.println("_______________________________________________");
					System.out.println("welcome " + isUser.getName() + "!");
					System.out.println("_______________________________________________");
					while (true) {
						System.out.println("Please choose an option:");
						System.out.println("1. Check Balance");
						System.out.println("2. Transfer Money");
						System.out.println("3. Deposit Money");
						System.out.println("4. Withdraw Money");
						System.out.println("5. Transaction History");
						System.out.println("6. Update profile");
						System.out.println("7. Exit");
						input = scanner.nextLine().trim();
						String message;
						switch (input) {
						case "1":
							message = "Please select an account by number (e.g., 1) To check Balance";
							int selectedAccountId = 0;
							if (isUser.getAccountId().size() > 1) {
								selectedAccountId = selectAccountIdFromUser(isUser.getAccountId(), scanner, message);
							} else {
								selectedAccountId = isUser.getAccountId().get(0);
							}

							if (selectedAccountId != -1) {
								try {
									while (true) {
										System.out.print("Enter the 4-digit PIN of bankAccount: ");
										bankPin = scanner.nextLine();

										if (bankPin.matches("\\d{4}")) {
											break;
										} else {
											System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
										}
									}

									accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection,
											selectedAccountId, bankPin);
									while (!accountVerify) {
										System.out.println("Wrong Pin! Please try again with a correct Pin.");
										System.out.println("Would you like to:");
										System.out.println("1. Try again");
										System.out.println("2. Go back to main menu");

										choice = scanner.nextLine();

										if (choice.equals("1")) {
											while (true) {
												System.out.print("Enter the 4-digit PIN of bankAccount: ");
												bankPin = scanner.nextLine();

												if (bankPin.matches("\\d{4}")) {
													break;
												} else {
													System.out.println(
															"Invalid PIN. It must be exactly 4 digits. Try again.");
												}
											}

											accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection,
													selectedAccountId, bankPin);
										} else if (choice.equals("2")) {
											break;
										} else {
											System.out.println(" Invalid choice. Please enter 1 or 2.");
										}
										if ("2".equals(choice)) {
											break;
										}
									}

									double balance = CheckBalance.checkBalance(selectedAccountId, connection);
									System.out.println("_______________________________________________");
									System.out.println("Account ID: " + selectedAccountId + " | Balance: ₹" + balance);
									System.out.println("_______________________________________________");
								} catch (DatabaseException e) {
									System.out.println(" Error: " + e.getMessage());
								}
							}
							break;

						case "2":
							message = "Please select the account number (e.g., 1) from which you want to send money:";

							int accountNumber = 0;
							double amount = 0;
							String userChoice = null;
							while (true) {
								System.out.print("Enter recipient account number: ");
								try {
									accountNumber = scanner.nextInt();
									scanner.nextLine();
									if (accountNumber <= 0) {
										System.out.println("Account number must be a positive number.");
									} else {
										break;
									}
								} catch (InputMismatchException e) {
									System.out.println("Invalid input. Please enter a numeric account number.");
									scanner.nextLine();
								}
							}

							isAccountExist = AccountExist.accountExists(connection, accountNumber);

							while (!isAccountExist) {
								System.out.println(" Account number not found! Please try again !");
								System.out.println("Would you like to:");
								System.out.println("1. Try again");
								System.out.println("2. Go back to main menu");

								userChoice = scanner.nextLine();

								if (userChoice.equals("1")) {
									while (true) {
										System.out.print("Enter recipient account number: ");
										try {
											accountNumber = scanner.nextInt();
											scanner.nextLine();
											if (accountNumber <= 0) {
												System.out.println("Account number must be a positive number.");
											} else {
												break;
											}
										} catch (InputMismatchException e) {
											System.out.println("Invalid input. Please enter a numeric account number.");
											scanner.nextLine();
										}
									}
									isAccountExist = AccountExist.accountExists(connection, accountNumber);
								} else if (userChoice.equals("2")) {
									break;
								} else {
									System.out.println(" Invalid choice. Please enter 1 or 2.");
								}
							}
							if ("2".equals(userChoice)) {
								break;
							}

							while (true) {
								System.out.print("Enter amount to transfer: ");
								try {
									amount = scanner.nextDouble();
									if (amount <= 0) {
										System.out.println("Amount must be greater than zero.");
									} else if (amount % 10 != 0) {
										System.out.println("Amount must be a multiple of 10.");
									} else {
										break;
									}
								} catch (InputMismatchException e) {
									System.out.println("Invalid input. Please enter a numeric value.");
									scanner.nextLine();
								}
							}

							int senderAccountId = 0;
							if (isUser.getAccountId().size() > 1) {
								senderAccountId = selectAccountIdFromUser(isUser.getAccountId(), scanner, message);
							} else {
								senderAccountId = isUser.getAccountId().get(0);
							}

							if (senderAccountId != -1) {
								while (true) {
									System.out.print("Enter the 4-digit PIN of bankAccount: ");
									bankPin = scanner.nextLine();

									if (bankPin.matches("\\d{4}")) {
										break;
									} else {
										System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
									}
								}

								accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection, senderAccountId,
										bankPin);
								while (!accountVerify) {
									System.out.println("Wrong Pin! Please try again with a correct Pin.");
									System.out.println("Would you like to:");
									System.out.println("1. Try again");
									System.out.println("2. Go back to main menu");

									userChoice = scanner.nextLine();

									if (userChoice.equals("1")) {
										while (true) {
											System.out.print("Enter the 4-digit PIN of bankAccount: ");
											bankPin = scanner.nextLine();

											if (bankPin.matches("\\d{4}")) {
												break;
											} else {
												System.out.println(
														"Invalid PIN. It must be exactly 4 digits. Try again.");
											}
										}

										accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection,
												senderAccountId, bankPin);
									} else if (userChoice.equals("2")) {
										break;
									} else {
										System.out.println(" Invalid choice. Please enter 1 or 2.");
									}

								}
								System.out.println(userChoice);
								if (!accountVerify || "2".equals(userChoice)) {
									break;
								}
								System.out.println("_______________________________________________");
								TransferMoney.transferMoney(senderAccountId, accountNumber, amount, connection);
								System.out.println("_______________________________________________");

								break;
							}

						case "3":
							message = "Please choose the account number (e.g., 1) to deposit money into:";

							double depositAmount = 0;
							boolean validInput = false;
							String depositChoice = null;
							while (!validInput) {
								System.out.print("Enter amount to Deposit: ");
								try {
									depositAmount = scanner.nextDouble();
									if (depositAmount <= 0) {
										System.out.println("Amount must be greater than 0.");
									} else {
										validInput = true;
									}
								} catch (InputMismatchException e) {
									System.out.println("Invalid input. Please enter a numeric value.");
									scanner.nextLine();
								}
							}
							scanner.nextLine();
							int accountId = 0;
							if (isUser.getAccountId().size() > 1) {
								accountId = selectAccountIdFromUser(isUser.getAccountId(), scanner, message);
							} else {
								accountId = isUser.getAccountId().get(0);
							}

							if (accountId != -1) {

								while (true) {
									System.out.print("Enter the 4-digit PIN of bankAccount: ");
									bankPin = scanner.nextLine();

									if (bankPin.matches("\\d{4}")) {
										break;
									} else {
										System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
									}
								}

								accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection, accountId,
										bankPin);
								while (!accountVerify) {
									System.out.println("Wrong Pin! Please try again with a correct Pin.");
									System.out.println("Would you like to:");
									System.out.println("1. Try again");
									System.out.println("2. Go back to main menu");

									depositChoice = scanner.nextLine();

									if (depositChoice.equals("1")) {
										while (true) {
											System.out.print("Enter the 4-digit PIN of bankAccount: ");
											bankPin = scanner.nextLine();

											if (bankPin.matches("\\d{4}")) {
												break;
											} else {
												System.out.println(
														"Invalid PIN. It must be exactly 4 digits. Try again.");
											}
										}

										accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection, accountId,
												bankPin);
									} else if (depositChoice.equals("2")) {
										break;
									} else {
										System.out.println(" Invalid choice. Please enter 1 or 2.");
									}

								}
								System.out.println(depositChoice);
								if (!accountVerify || "2".equals(depositChoice)) {
									break;
								}

								System.out.println("_______________________________________________");
								DepositMoney.depositMoney(accountId, depositAmount, connection);
								System.out.println("_______________________________________________");

							}

							break;
						case "4":
							message = "Please select the account number (e.g., 1) to withdraw money from:";

							double withdrawAmount = 0;
							String withdrawChoice = null;
							while (true) {
								System.out.print("Enter amount to withdraw: ");
								try {
									withdrawAmount = scanner.nextDouble();
									if (withdrawAmount <= 0) {
										System.out.println("Amount must be greater than 0.");
									} else {
										break;
									}
								} catch (InputMismatchException e) {
									System.out.println("Invalid input. Please enter a numeric value.");
									scanner.nextLine();
								}
							}
							scanner.nextLine();
							int withdarwAccountId = 0;
							if (isUser.getAccountId().size() > 1) {
								withdarwAccountId = selectAccountIdFromUser(isUser.getAccountId(), scanner, message);
							} else {
								withdarwAccountId = isUser.getAccountId().get(0);
							}

							if (withdarwAccountId != -1) {
								while (true) {
									System.out.print("Enter the 4-digit PIN of bankAccount: ");
									bankPin = scanner.nextLine();

									if (bankPin.matches("\\d{4}")) {
										break;
									} else {
										System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
									}
								}

								accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection, withdarwAccountId,
										bankPin);
								while (!accountVerify) {
									System.out.println("Wrong Pin! Please try again with a correct Pin.");
									System.out.println("Would you like to:");
									System.out.println("1. Try again");
									System.out.println("2. Go back to main menu");

									withdrawChoice = scanner.nextLine();

									if (withdrawChoice.equals("1")) {
										while (true) {
											System.out.print("Enter the 4-digit PIN of bankAccount: ");
											bankPin = scanner.nextLine();

											if (bankPin.matches("\\d{4}")) {
												break;
											} else {
												System.out.println(
														"Invalid PIN. It must be exactly 4 digits. Try again.");
											}
										}

										accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection,
												withdarwAccountId, bankPin);
									} else if (withdrawChoice.equals("2")) {
										break;
									} else {
										System.out.println(" Invalid choice. Please enter 1 or 2.");
									}

								}
								System.out.println(withdrawChoice);
								if (!accountVerify || "2".equals(withdrawChoice)) {
									break;
								}

								System.out.println("_______________________________________________");
								WithdrawMoney.withdrawMoney(withdarwAccountId, withdrawAmount, connection);
								System.out.println("_______________________________________________");

							}
							break;
						case "5":
							message = "Please select the Account ID for which you want to view the transaction history:";
							int selectAccountId = 0;
							String transactionChoice = null;
							if (isUser.getAccountId().size() > 1) {
								selectAccountId = selectAccountIdFromUser(isUser.getAccountId(), scanner, message);
							} else {
								selectAccountId = isUser.getAccountId().get(0);
							}

							if (selectAccountId != -1) {
								while (true) {
									System.out.print("Enter the 4-digit PIN of bankAccount: ");
									bankPin = scanner.nextLine();

									if (bankPin.matches("\\d{4}")) {
										break;
									} else {
										System.out.println("Invalid PIN. It must be exactly 4 digits. Try again.");
									}
								}

								accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection, selectAccountId,
										bankPin);
								while (!accountVerify) {
									System.out.println("Wrong Pin! Please try again with a correct Pin.");
									System.out.println("Would you like to:");
									System.out.println("1. Try again");
									System.out.println("2. Go back to main menu");

									transactionChoice = scanner.nextLine();

									if (transactionChoice.equals("1")) {
										while (true) {
											System.out.print("Enter the 4-digit PIN of bankAccount: ");
											bankPin = scanner.nextLine();

											if (bankPin.matches("\\d{4}")) {
												break;
											} else {
												System.out.println(
														"Invalid PIN. It must be exactly 4 digits. Try again.");
											}
										}

										accountVerify = AccountVerifyWithPin.accountVerifyWithPin(connection,
												selectAccountId, bankPin);
									} else if (transactionChoice.equals("2")) {
										break;
									} else {
										System.out.println(" Invalid choice. Please enter 1 or 2.");
									}

								}
								System.out.println(transactionChoice);
								if (!accountVerify || "2".equals(transactionChoice)) {
									break;
								}

								System.out.println("_______________________________________________");
								ShowTransactionHistory.showTransactionHistory(selectAccountId, connection);
								System.out.println("_______________________________________________");

							}

							break;
						case "6":
							EditProfileOption.editProfile(scanner, isUser, connection);
							break;

						case "7":
							System.out.println("Returning to main menu...");
							break;
						default:
							System.out.println("Please select a correct option (1-7).");
							continue;
						}
						if (input.equals("7"))
							break;
					}

				}

				break;

			case "3":
				System.out.println("Thank you for using the banking system. Goodbye!");
				return;

			default:
				System.out.println("Please select a correct option (1-3).");
			}
		}
	}

	private int getUserIdFromInput(Scanner scanner) {
		int userId;
		while (true) {
			try {
				System.out.print("Enter User ID (number): ");
				userId = scanner.nextInt();
				scanner.nextLine();
				return userId;
			} catch (InputMismatchException e) {
				System.out.println("Enter only Integer value.");
				scanner.nextLine();
			}
		}
	}

	public static int selectAccountIdFromUser(List<Integer> accountIds, Scanner scanner, String message) {
		if (accountIds == null || accountIds.isEmpty()) {
			System.out.println("No accounts available for selection.");
			return -1;
		}

		System.out.println("Here are your account(s):");
		for (int i = 0; i < accountIds.size(); i++) {
			System.out.println((i + 1) + ". Account ID: " + accountIds.get(i));
		}

		while (true) {
			System.out.print(message);
			try {
				int choice = scanner.nextInt();
				scanner.nextLine();

				if (choice >= 1 && choice <= accountIds.size()) {
					return accountIds.get(choice - 1);
				} else {
					System.out.println("Invalid choice. Please select a number from the list.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine();
			}
		}
	}

}
