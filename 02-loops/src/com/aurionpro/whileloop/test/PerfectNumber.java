package com.aurionpro.whileloop.test;

public class PerfectNumber {
public static void main(String[] args) {
	int number=6;
	int i=1;
	int sum=0;
	while(i<number) {
		if(number%i==0) {
			sum+=i;
		}
		i++;
	}
if(sum==number) {
	System.out.print("It is a perfect number");
}else {
	System.out.print("It is not a perfect number");
}
}
}
