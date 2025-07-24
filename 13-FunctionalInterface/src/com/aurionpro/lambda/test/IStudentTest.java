package com.aurionpro.lambda.test;

import com.aurionpro.lambda.model.IStudent;

public class IStudentTest {
public static void main(String[] args) {
	//Anonymos
	IStudent student=new IStudent() {

		@Override
		public void greet() {
			System.out.println("Hello");
			
		}
		
	};
//	IStudent student=()->System.out.println("Hello");
	student.greet();
}
}
