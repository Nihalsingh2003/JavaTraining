package com.aurionpro.abstraction.test;

import java.util.Scanner;

import com.aurionpro.abstraction.model.Archer;
import com.aurionpro.abstraction.model.GameCharacterType;
import com.aurionpro.abstraction.model.Warrior;

public class GameCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int userInput;
		while (true) {
			System.out.println("Please Select GameCharacter 1-2:");
			for (GameCharacterType result : GameCharacterType.values()) {
				System.out.println(result.ordinal() + 1 + "." + result);
			}
			if (scanner.hasNextInt()) {
				userInput = scanner.nextInt();
				if (userInput == 1 || userInput == 2) {
					break;
				} else {
					System.out.println("Invalid option. Please enter 1 or 2.\n");
				}
			} else {
				System.out.println("Invalid input. Please enter a number (1 or 2).\n");

			}

		}
		scanner.nextLine();
		switch (userInput) {
		case 1:
			String name = null;

			// Validate Name
			while (true) {
				System.out.println("Enter  Name:");
				name = scanner.nextLine();

				boolean hasDigit = false;
				for (int j = 0; j < name.length(); j++) {
					if (Character.isDigit(name.charAt(j))) {
						hasDigit = true;
						break;
					}
				}

				if (hasDigit) {
					System.out.println("Invalid name. Name should not contain numbers. Please try again.");
				} else if (name.trim().isEmpty()) {
					System.out.println("Name cannot be empty. Please enter a valid name.");
				} else {
					break;
				}
			}
			Warrior warrior = new Warrior(name, 100);
			for (int i = 0; i < 2; i++) {
				warrior.attack();
			}
			warrior.updatedPowerLevel();
			break;
		case 2:
			String archerName = null;

			// Validate Name
			while (true) {
				System.out.println("Enter  ArcherName:");
				archerName = scanner.nextLine();

				boolean hasDigit = false;
				for (int j = 0; j < archerName.length(); j++) {
					if (Character.isDigit(archerName.charAt(j))) {
						hasDigit = true;
						break;
					}
				}

				if (hasDigit) {
					System.out.println("Invalid name. Name should not contain numbers. Please try again.");
				} else if (archerName.trim().isEmpty()) {
					System.out.println("Name cannot be empty. Please enter a valid name.");
				} else {
					break;
				}
			}
			Archer archer = new Archer(archerName, 100);
			for (int i = 0; i < 2; i++) {
				archer.attack();
			}
			archer.updatedPowerLevel();
			break;
		}
	}
}
