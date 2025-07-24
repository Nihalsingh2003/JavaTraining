package com.aurionpro.poly.test;

import java.util.Scanner;

import com.aurionpro.poly.model.Greeter;

public class GreeterTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=scanner.nextLine();
	Greeter greeter=new Greeter();
	greeter.greet();
	greeter.greet(name);
}
}
