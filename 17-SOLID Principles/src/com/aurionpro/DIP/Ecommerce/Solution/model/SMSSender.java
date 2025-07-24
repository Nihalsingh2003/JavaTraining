package com.aurionpro.DIP.Ecommerce.Solution.model;

public class SMSSender implements ISendNotification {

	@Override
	public void sendNotification() {
		System.out.println("-----------------------------");
		System.out.println("SMS is send !");
		System.out.println("-----------------------------");

	}

}
