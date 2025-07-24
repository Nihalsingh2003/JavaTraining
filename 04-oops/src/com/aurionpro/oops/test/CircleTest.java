package com.aurionpro.oops.test;

import java.util.Scanner;

import com.aurionpro.oops.model.Circle;

public class CircleTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Radius in cm:");
	Circle circle=new Circle();
	double radius=scanner.nextDouble();
	circle.setRadius(radius);
	double areaOfCircle=circle.calculateArea();
	System.out.println("Area of Circle is: "+areaOfCircle);
	scanner.close();
}
}
