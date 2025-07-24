package com.aurionpro.supplier.Test;

import java.util.Scanner;
import java.util.function.Supplier;

public class DefaultCity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Supplier<String> supplier = () -> "pune";
		System.out.println("Please Input a city");
		String userInput = scanner.nextLine();
		if (userInput == null || userInput.isEmpty()) {
			 System.out.println("City: "+supplier.get()); 
		} else {
			System.out.println("City: "+ userInput);
		}
	}
}
