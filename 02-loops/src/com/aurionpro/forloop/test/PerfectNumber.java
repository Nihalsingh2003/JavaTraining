package com.aurionpro.forloop.test;

public class PerfectNumber {
public static void main(String[] args) {
	int number=2;
	int sum=0;
	for(int i=1;i<number;i++) {
		if(number%i==0) {
			sum=sum+i;
		}
	}
	if(sum==number) {
		System.out.print("It is a perfect number");
	}else {
		System.out.print("It is not a perfect number");
	}
}
}
