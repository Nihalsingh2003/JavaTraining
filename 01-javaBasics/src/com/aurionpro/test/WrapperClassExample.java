package com.aurionpro.test;

public class WrapperClassExample {
public static void main(String[] args) {
	int number1=20;
	Integer number2=new Integer(number1);//Boxing
	Integer number3=number1;//Auto Boxing
	
	System.out.println(number1==number3);
	
	int number5=number3.intValue();//unBoxing
	int number6=number3;//Auto Boxing
	
	System.out.println(number5==number6);
}
}
