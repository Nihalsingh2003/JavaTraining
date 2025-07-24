package com.aurionpro.DIP.Ecommerce.Solution.model;

public class PushNotifier implements ISendNotification {

	@Override
	public void sendNotification() {
		System.out.println("-----------------------------");
		System.out.println("Push Notification is send!");
		System.out.println("-----------------------------");

	}

}
