package com.aurionpro.poly.model;

public class Printer {
private int number;
private String message;

public void print() {
	System.out.println("Default message");
}
public void print(String message) {
	System.out.println("Message: "+message);
}
public void print(int number) {
	System.out.println("Number: "+number);
}
}
