package com.aurionpro.test;

public class SwapWithOutThirdVariable {
public static void main(String[] args) {
	int numberOne=7;
	int numberTwo=3;
	
	 numberOne=numberOne+numberTwo;
	 numberTwo=numberOne-numberTwo;
	 numberOne=numberOne-numberTwo;
	 
	 System.out.println("NumberOne: " + numberOne + " NumhberTwo:" + numberTwo);
}
}
