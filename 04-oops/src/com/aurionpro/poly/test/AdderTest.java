package com.aurionpro.poly.test;

import java.util.Scanner;

import com.aurionpro.poly.model.Adder;

public class AdderTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number in integer");
	int number1 = scanner.nextInt();
	System.out.println("Enter the number in integer");
	int number2=scanner.nextInt();
	System.out.println("Enter the number in integer");
	int number3=scanner.nextInt();
	System.out.println("Enter the number in double");
	double number5=scanner.nextDouble();
	System.out.println("Enter the number in double");
	double number6=scanner.nextDouble();
	
	Adder adder=new Adder();
	double add1=adder.add(number5, number6);
	System.out.println(add1);
	int add2=adder.add(number1, number2);
	System.out.println(add2);
	int add3=adder.add(number1, number2, number3);
	System.out.println(add3);
}
}
