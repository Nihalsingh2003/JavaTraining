package com.aurionpro.Assignment.test;

public class CountWordsSentence {
	public static void main(String[] args) {
		String sentence = "Hii i am";
		String[] copyString = sentence.split(" ");

		int length = copyString.length;
		System.out.println("Count of words in sentence is: " + length);

	}
}
