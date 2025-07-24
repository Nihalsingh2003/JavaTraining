package com.aurionpro.test;

public class LargestNumber {
	public static void main(String[] args) {
		int numberOne=4;
		int numberTwo=8;
		int numberThree=2;
		
		if(numberOne>numberTwo && numberOne>numberThree) {
			System.out.print("numberOne is largest.");
		}
		else if(numberTwo>numberThree) {
			System.out.print("numberTwo is largest.");
		}
		else {
			System.out.print("numberThree is largest.");
		}
	}
}
