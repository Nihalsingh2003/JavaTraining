package com.aurionpro.poly.model;

public class VolumeCalculator {

public void volume(int side) {
	System.out.println("The volume of cube is:"+Math.pow(side, 3));
}
public void volume(int length, int breadth, int height) {
	System.out.println("The volume of cuboid is:"+(length*breadth*height));
}
public void volume(double radius) {
	System.out.println("The volume of sphere is:"+(4/3*3.14*Math.pow(radius, 3)));
}
}
