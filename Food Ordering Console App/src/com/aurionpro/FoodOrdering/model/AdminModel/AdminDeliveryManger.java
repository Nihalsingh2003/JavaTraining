package com.aurionpro.FoodOrdering.model.AdminModel;

import java.util.Scanner;

import com.aurionpro.FoodOrdering.model.DeliveryPartner;
import com.aurionpro.FoodOrdering.model.DeliveryPartnerManager;

public class AdminDeliveryManger {

	public static void adminDeliveryManger(DeliveryPartnerManager manager) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Delivery Agent Management ---");
			System.out.println("1. Add Delivery Partner");
			System.out.println("2. Remove Delivery Partner");
			System.out.println("3. List All Delivery Partners");
			System.out.println("4. Back");

			System.out.print("Enter your choice: ");
			String choice = scanner.nextLine();

			switch (choice) {
			case "1":
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Contact Number: ");
				String contact = scanner.nextLine();

				manager.addDeliveryPartner(new DeliveryPartner(id, name, contact));
				break;

			case "2":
				System.out.print("Enter ID to Remove: ");
				int removeId = Integer.parseInt(scanner.nextLine());
				manager.removeDeliveryPartner(removeId);
				break;

			case "3":
				manager.listDeliveryPartners();
				break;

			case "4":
				break;

			default:
				System.out.println("Invalid input. Please try again.");
			}
			if ("4".equals(choice)) {
				break;
			}
		}
	}
}
