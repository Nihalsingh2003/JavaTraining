package com.aurionpro.enumass.model;

public class Ticket {
	private String customerName;
	 private TicketType ticketType;
	private double price;
	private BookingStatus bookingStatus;

	public String getCustomerName() {
		return customerName;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public double getPrice() {
		return price;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}

	public void setBookingStatus(BookingStatus status) {
		this.bookingStatus = status;
	}

	public void calculatePrice(TicketType ticketType) {
		if (ticketType==TicketType.Regular  ) {
			this.price = 200;
		} else if (ticketType==TicketType.PREMIUM) {
			this.price = 600;
		} else {
			this.price = 1200;
		}

	}
}
