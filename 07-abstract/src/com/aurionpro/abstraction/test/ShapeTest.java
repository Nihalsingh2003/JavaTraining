package com.aurionpro.abstraction.test;

import com.aurionpro.abstraction.model.Circle;
import com.aurionpro.abstraction.model.Shape;
import com.aurionpro.abstraction.model.Square;
import com.aurionpro.abstraction.model.Triangle;

public class ShapeTest {
public static void main(String[] args) {
	Shape[] shape=new Shape[3];
	shape[0]=new Circle("circle");
	shape[1]=new Square("Square");
	shape[2]=new Triangle("Tiangle");
	for(Shape result:shape) {
		result.draw();
	}
	
}
}
