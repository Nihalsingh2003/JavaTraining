package com.aurionpro.Assignment.test;

public class LongestWordInSentence {
public static void main(String[] args) {
	String sentence = "Hii NihalSingh";
	String[] copyString = sentence.split(" ");
	String maxWord="";
	int maxLength=0;
	for(int i=0;i<copyString.length;i++) {
		if(copyString[i].length()>maxLength) {
			maxWord=copyString[i];
			maxLength=copyString[i].length();
		}
	}
	System.out.print(maxWord);
	
}
}
