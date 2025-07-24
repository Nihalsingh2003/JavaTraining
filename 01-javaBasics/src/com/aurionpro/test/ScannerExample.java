package com.aurionpro.test;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.print("Pls Enter Your age:");
	int age=scanner.nextInt();
	
	scanner.nextLine();
	System.out.print("Enter your name:");
	String userName=scanner.nextLine();
	
	
	
	System.out.print("Pls Enter Your number1:");
	float number1=scanner.nextInt();
	
	System.out.print("Pls Enter Your number2:");
	int number2=scanner.nextInt();
	
	System.out.println("UsreName: " + userName + ", Age: " + age);
	System.out.println("number1: " + number1 + ", number2: " + number2);
	scanner.close();
}
}
