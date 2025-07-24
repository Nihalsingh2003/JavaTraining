package com.aurionpro.enumeration.test;

import com.aurionpro.enumeration.model.PaymentStatus;

public class PaymentTest {
public static void printMessage(PaymentStatus status) {
	switch(status) {
	case SUCCESS:
		System.out.println("Payment received");
		break;
	case PENDING:
		System.out.println("Payment PENDING");
		break;
	case FAILED:
		System.out.println("Payment FAILED");
		break;
	case CANCELLED:
		System.out.println("Payment CANCELLED");
	}
}
public static void main(String[] args) {
	for(PaymentStatus result:PaymentStatus.values()) {
		printMessage(result);
	}
}
}
