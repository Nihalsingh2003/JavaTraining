package com.aurionpro.Assignment.test;

import java.util.Scanner;

public class TreasureIslandProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island.Your mission is to find the treasure");
		System.out.println("Choose One option from Below Two Options:- ");
		System.out.println("1 - Left");
		System.out.println("2 - Right");
		int userInput = scanner.nextInt();
		if (userInput == 1) {
			System.out.println("Choose One option from  Two Options:-");
			System.out.println("1 - Swim");
			System.out.println("2 - Wait");
			int userChoice = scanner.nextInt();
			if (userChoice == 1) {
				System.out.println("Which door?");
				System.out.println("Choose one option from the three below by entering the corresponding number:");
				System.out.println("1 - Red");
				System.out.println("2 - Blue");
				System.out.println("3 - Yellow");
				int userColorChoice = scanner.nextInt();
				switch (userColorChoice) {
				case 1:
					System.out.println("Burned by fire Game Over.");
					break;
				case 2:
					System.out.println("Eaten by beasts Game Over");
					break;
				case 3:
					System.out.println("You Win!");
					break;
				default:
					System.out.println("Game Over");

				}
			} else {
				System.out.print("Attacked by trout Game Over.");
			}
		} else {
			System.out.print("Fall into a hole Game Over.");
		}
		scanner.close();
	}
}
