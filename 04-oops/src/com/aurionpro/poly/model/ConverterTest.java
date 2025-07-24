package com.aurionpro.poly.model;

import java.util.Scanner;

public class ConverterTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter celsius:");
	double celsius=scanner.nextDouble();
	System.out.println("Enter value:");
	double value=scanner.nextDouble();
	scanner.nextLine();
	System.out.println("Enter scale:");
	 String scale=scanner.nextLine();
	 
	 Converter converter=new Converter();
	 double result1=converter.convert(celsius);
	 double result2=converter.convert(value, scale);
	 System.out.println(result1);	
	 System.out.println(result2);	
	 
	 
	 
}
}
