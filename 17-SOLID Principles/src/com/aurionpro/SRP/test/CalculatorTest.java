package com.aurionpro.SRP.test;

import java.util.Scanner;

import com.aurionpro.SRP.model.Addition;
import com.aurionpro.SRP.model.Calculator;
import com.aurionpro.SRP.model.Divide;
import com.aurionpro.SRP.model.Multiplication;
import com.aurionpro.SRP.model.Subtraction;

public class CalculatorTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Please Enter the number1");
	double number1=scanner.nextDouble();
	System.out.println("Please Enter the number2");
	double number2=scanner.nextDouble();
	
	Calculator calculator =new Calculator(number1, number2);
	
	Addition add=new Addition();
	add.add(calculator);
	Subtraction sub=new Subtraction();
	sub.sub(calculator);
	Divide div=new Divide();
	div.divide(calculator);
	Multiplication multi=new Multiplication();
	multi.multi(calculator);
	
	
	
	
}
}
