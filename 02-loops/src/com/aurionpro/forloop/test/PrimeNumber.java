package com.aurionpro.forloop.test;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 4;
		boolean isPrime = true;
		if (number <= 1) {
			System.out.print("It is not a prime number");
			isPrime = false;

		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.print("It is a prime number");
		} else {
			System.out.print("It is not a prime number");
		}

	}
}
