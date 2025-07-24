package com.aurionpro.poly.test;

import java.util.Scanner;

import com.aurionpro.poly.model.Printer;

public class PrinterTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Message");
	String message=scanner.nextLine();
	System.out.println("Enter the number");
	int number=scanner.nextInt();
	
	Printer printer=new Printer();
	printer.print();
	printer.print(number);
	printer.print(message);
	
	
}
}
