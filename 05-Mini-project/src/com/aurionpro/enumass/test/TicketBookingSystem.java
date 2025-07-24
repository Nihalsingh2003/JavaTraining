package com.aurionpro.enumass.test;

import java.util.Scanner;

import com.aurionpro.enumass.model.BookingStatus;
import com.aurionpro.enumass.model.Ticket;
import com.aurionpro.enumass.model.TicketType;

public class TicketBookingSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ticket ticket = new Ticket();
		ticket.setBookingStatus(BookingStatus.PENDING);
		System.out.println("-----------Wellcome to TicketBookingSystem------");
		System.out.println("Enter Your Name:");
		String name = scanner.nextLine();
		// Display ticket options
		System.out.println("Select ticket type:");
		for (TicketType type : TicketType.values()) {
			System.out.println(type.ordinal() + 1 + ". " + type);
		}
		int choice = scanner.nextInt();
		TicketType selectedType = null;
		switch (choice) {
		case 1:
			selectedType = TicketType.values()[choice - 1];
		case 2:
			selectedType = TicketType.values()[choice - 1];
		case 3:
			selectedType = TicketType.values()[choice - 1];
		default:
			System.out.println("Enter a valid choice");
		}
		System.out.println("Your TicketBookingStatus: " + (ticket.getBookingStatus()));
		scanner.nextLine();
		System.out.println("Enter CONFIRME or CANCEL:");
		String status = scanner.nextLine();

		ticket.setCustomerName(name);
		ticket.setTicketType(selectedType);
//	ticket.setBookingStatus(status);
		ticket.calculatePrice(selectedType);

		if (status.equalsIgnoreCase("CONFIRME")) {
			System.out.println("----------------BILL-------------------------------");
			System.out.println("CustomerName: " + (ticket.getCustomerName()));
			System.out.println("TicketType: " + (ticket.getTicketType()));
			System.out.println("Price: " + (ticket.getPrice()));
			ticket.setBookingStatus(BookingStatus.CONFIRMED);
			System.out.println("TicketStatus: " + (ticket.getBookingStatus()));
			System.out.println("------------------------------------------");

		} else if (status.equalsIgnoreCase("CANCEL")) {
			System.out.println("----------------BILL-------------------------------");
			System.out.println("CustomerName: " + (ticket.getCustomerName()));
			System.out.println("TicketType: " + (ticket.getTicketType()));
			System.out.println("Price: " + (ticket.getPrice()));
			ticket.setBookingStatus(BookingStatus.CANCELLED);
			System.out.println("TicketStatus: " + (ticket.getBookingStatus()));
			System.out.println("------------------------------------------");

		} else {
			System.out.println("Please check the input");
			ticket.setBookingStatus(BookingStatus.PENDING);
		}
		scanner.close();

	}
}
