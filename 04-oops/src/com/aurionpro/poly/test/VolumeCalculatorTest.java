package com.aurionpro.poly.test;

import java.util.Scanner;

import com.aurionpro.poly.model.VolumeCalculator;

public class VolumeCalculatorTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the side");
	int side = scanner.nextInt();
	System.out.println("Enter the length");
	int length = scanner.nextInt();
	System.out.println("Enter the breadth");
	int breadth = scanner.nextInt();
	System.out.println("Enter the height");
	int height = scanner.nextInt();
	System.out.println("Enter the radius");
	double radius = scanner.nextDouble();
	
	VolumeCalculator volumeCalculator=new VolumeCalculator();
	volumeCalculator.volume(side);
	volumeCalculator.volume(length, breadth, height);
	volumeCalculator.volume(radius);
	scanner.close();
}
}
