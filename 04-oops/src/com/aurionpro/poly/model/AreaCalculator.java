package com.aurionpro.poly.model;

public class AreaCalculator {
private int side;
private int length;
private int breadth;
private double radius;

public int area(int side) {
	return side*side;
}
public int area(int length,int breath) {
	return length*breath;
}
public double area(double radius) {
	return 3.14*(radius*radius);
}
}
