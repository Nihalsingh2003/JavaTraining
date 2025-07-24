package com.aurionpro.DIP.Ecommerce.Solution.model;

public class OrderService {
	private ISendNotification send;

	public OrderService(ISendNotification notify) {
		this.send = notify;
	}
	public void send() {
		send.sendNotification();
	}
}
