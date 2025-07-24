package com.aurionpro.abstraction.model;

public class Circle extends Shape {
	public Circle(String shapeName) {
		super(shapeName);
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + getShapeName() + "...");
		
	}
}
