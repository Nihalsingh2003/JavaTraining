package com.aurionpro.poly.model;

public class Converter {
private double celsius;
private double value;
private String scale;

public double convert(double celsius) {
	return (celsius*9/5+32);
}
public double convert(double value, String scale) {
	if(scale.equalsIgnoreCase("c")) {
		return (value*9/5+32);
	}
	else if(scale.equalsIgnoreCase("f")) {
		return (value*5/9-32);
	}
	return 0;
}
}
