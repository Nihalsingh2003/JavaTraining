package com.aurionpro.FoodOrdering.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeliveryPartnerManager {
	private List<DeliveryPartner> partners = new ArrayList<>();

	public void addDeliveryPartner(DeliveryPartner partner) {
		partners.add(partner);
		System.out.println("Delivery Partner added successfully.");
	}

	public void removeDeliveryPartner(int id) {
		Iterator<DeliveryPartner> iterator = partners.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			DeliveryPartner partner = iterator.next();
			if (partner.getId() == id) {
				iterator.remove();
				found = true;
				System.out.println("Delivery Partner removed successfully.");
				break;
			}
		}
		if (!found) {
			System.out.println("Partner with ID " + id + " not found.");
		}
	}

	public void listDeliveryPartners() {
		if (partners.isEmpty()) {
			System.out.println("No delivery partners available.");
			return;
		}
		System.out.println("List of Delivery Partners:");
		for (DeliveryPartner partner : partners) {
			System.out.println(partner);
		}
	}
	public List<DeliveryPartner> getPartners() {
	    return new ArrayList<>(partners); 
	}

}
