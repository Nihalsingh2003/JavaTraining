package com.aurionpro.poly.test;

import java.util.Scanner;

import com.aurionpro.poly.model.AreaCalculator;

public class AreaCalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side");
		int side = scanner.nextInt();
		System.out.println("Enter the length");
		int length = scanner.nextInt();
		System.out.println("Enter the breadth");
		int breadth = scanner.nextInt();
		System.out.println("Enter the radius");
		double radius = scanner.nextDouble();

		AreaCalculator areaCalculator = new AreaCalculator();

		int areaSide=areaCalculator.area(side);
		System.out.println("Side:"+areaSide);
		double circleRadius=areaCalculator.area(radius);
		System.out.println("circleRadius:"+circleRadius);
		int reactangle=areaCalculator.area(length, breadth);
		System.out.println("reactangle:"+reactangle);
		scanner.close();

	}
}
