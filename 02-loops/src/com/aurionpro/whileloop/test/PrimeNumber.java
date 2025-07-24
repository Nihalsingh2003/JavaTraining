package com.aurionpro.whileloop.test;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;

		}
		int i = 1;
		while (i < number /2) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		if (isPrime) {
			System.out.print("The number is prime");
		} else {
			System.out.print("The number is prime");
		}

	}
}
