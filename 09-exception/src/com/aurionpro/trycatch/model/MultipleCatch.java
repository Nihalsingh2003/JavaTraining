package com.aurionpro.trycatch.model;

import java.util.Scanner;

public class MultipleCatch {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] array=new int[2];
	try {
//		for(int i=0;i<array.length;i++) {
//			array[i]=scanner.nextInt();
//		}
		String name=null;
//		System.out.println(array[3]);
		System.out.println(name.length());
		
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}catch(NullPointerException e) {
		System.out.println(e);
	};
}
}
