package com.aurionpro.DIP.Ecommerce.Solution.model;

public class EmailSender implements ISendNotification {

	@Override
	public void sendNotification() {
		System.out.println("-----------------------------");
		System.out.println("Email notification is Send!");
		System.out.println("-----------------------------");
	}

}
