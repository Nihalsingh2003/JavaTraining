package com.aurinopro.arrays.test;

import java.util.Arrays;

public class StudentMarks {
String studentName;
int rollNumber;
int[] marks;

public StudentMarks(String studentName,int rollNumber,int[] marks) {
	this.studentName=studentName;
	this.rollNumber=rollNumber;
	this.marks=marks;
}
public void display() {
	System.out.println("studentName: " + studentName +" rollNumber " +  rollNumber + " marks" + Arrays.toString(marks));
}
}
