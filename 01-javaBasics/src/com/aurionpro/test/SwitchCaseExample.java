package com.aurionpro.test;

import java.util.Scanner;

public class SwitchCaseExample {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Please Enter Two Numbers:");
	System.out.print("Please Enter  Number1:");
	int number1=scanner.nextInt();
	System.out.print("Please Enter  Number2:");
	int number2=scanner.nextInt();
	
	
	System.out.println("Please Enter Yor Choice");
	System.out.println("1.Addition "+" 2.Subtraction"+" 3.Division"+" 4.Multiplication");
	int choice=scanner.nextInt();
	
	switch(choice) {
	case 1:
		int add= number1+number2 ;
		System.out.print("Addition of Number1 and Number2 is :" +add);
		break;
	
	case 2:
		int sub= number1 - number2;
		System.out.print("Addition of Number1 and Number2 is :" + sub );
		break;
		
	case 3:
		System.out.print("Addition of Number1 and Number2 is :" + number1*number2 );
		break;
	case 4:
		System.out.print("Addition of Number1 and Number2 is :" + number1/number2 );
		break;
		
	default:
		System.out.print("Please Enter Valid choice");
		
	}
	

}
}
