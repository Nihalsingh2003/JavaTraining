package com.aurionpro.string.test;

public class StringBasic {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1.hashCode());
		String s2 = "Hello";
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);

		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s3==s4);
		
	}
}
