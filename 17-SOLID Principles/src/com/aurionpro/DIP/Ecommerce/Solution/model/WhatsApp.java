package com.aurionpro.DIP.Ecommerce.Solution.model;

public class WhatsApp implements ISendNotification {

	@Override
	public void sendNotification() {
		System.out.println("-----------------------------");
		System.out.println("WhatsApp notification is Send!");
		System.out.println("-----------------------------");
		
	}

}
