package com.aurionpro.abstraction.model;

public class Square extends Shape {
	public Square(String shapeName) {
		super(shapeName);
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + getShapeName() + "...");
		
	}
}
