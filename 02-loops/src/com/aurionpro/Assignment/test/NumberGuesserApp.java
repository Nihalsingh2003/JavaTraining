package com.aurionpro.Assignment.test;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserApp {
	public static void main(String[] args) {
		int guessCount = 0;
		int maxGuess = 5;
		boolean playAgain = true;
		int randomNumber = randomnumbergenerator();
		Scanner scanner = new Scanner(System.in);
		System.out.println(randomNumber);
		while (playAgain) {
			while (guessCount < maxGuess) {
				System.out.print("Enter Your Guess: ");
				int userGuess = scanner.nextInt();
				guessCount++;
				if (userGuess < randomNumber) {
					System.out.println("Sorry too  low");
					continue;
				} else if (userGuess > randomNumber) {
					System.out.println("Too high!");
					continue;
				} else {
					if (userGuess == randomNumber) {
						System.out.println("You Won!");
						System.out.print("Do you want to play the game again: 1-yes, 2-No ");
						int userChoice = scanner.nextInt();
						if (userChoice == 1) {
							randomNumber = randomnumbergenerator();
							guessCount = 0;
							System.out.println(randomNumber);
							break;
						} else {
							System.out.println("Game Over!");
							playAgain = false;
							break;
						}
					}
				}

			}

			if (guessCount == maxGuess) {
				System.out.println("Out of guesses! The correct number was: " + randomNumber);
				System.out.print("Do you want to play the game again? 1-Yes, 2-No: ");
				int userChoice = scanner.nextInt();
				if (userChoice == 1) {
					randomNumber = randomnumbergenerator();
					guessCount = 0;
					System.out.println(randomNumber);
				} else {
					System.out.println("Game Over!");
					playAgain = false;
				}
			}

		}

	}

	public static int randomnumbergenerator() {
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		return randomNumber;

	}
}
