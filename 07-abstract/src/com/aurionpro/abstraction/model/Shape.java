package com.aurionpro.abstraction.model;

public abstract class Shape {
	private String shapeName;

	 Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	public abstract void draw();

	public String getShapeName() {
		return shapeName;
	}

}
