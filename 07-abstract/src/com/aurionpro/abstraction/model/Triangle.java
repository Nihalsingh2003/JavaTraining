package com.aurionpro.abstraction.model;

public class Triangle extends Shape {
	public Triangle(String shapeName) {
		super(shapeName);
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + getShapeName() + "...");
		
	}
}
