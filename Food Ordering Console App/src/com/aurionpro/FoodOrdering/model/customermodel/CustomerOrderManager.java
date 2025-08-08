package com.aurionpro.FoodOrdering.model.customermodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.aurionpro.FoodOrdering.model.DeliveryPartner;
import com.aurionpro.FoodOrdering.model.DeliveryPartnerManager;
import com.aurionpro.FoodOrdering.model.DiscountManager;
import com.aurionpro.FoodOrdering.model.FoodMenu;
import com.aurionpro.FoodOrdering.model.InvoicePrinter;
import com.aurionpro.FoodOrdering.model.MenuStore;
import com.aurionpro.FoodOrdering.model.OrderItem;

public class CustomerOrderManager {

    private static final Scanner scanner = new Scanner(System.in);

    public static void startCustomerFlow(DeliveryPartnerManager manager) {
        List<OrderItem> orderItems = new ArrayList<>();

        while (true) {
            Set<String> categories = new HashSet<>();
            for (FoodMenu item : MenuStore.Menu) {
                categories.add(item.getFoodCategory());
            }

            System.out.println("\n===== CATEGORIES =====");
            List<String> categoryList = new ArrayList<>(categories);
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, categoryList.get(i));
            }

            int catChoice = getValidatedInput("Choose a category number (or 0 to exit): ", 0, categoryList.size());

           
            if (catChoice == 0) {
                if (!orderItems.isEmpty()) {
                    System.out.print("You have items in your cart. Exit and lose your cart? (yes/no): ");
                    String confirm = scanner.nextLine();
                    if (!confirm.equalsIgnoreCase("yes")) {
                        continue;
                    }
                }
                System.out.println("Returning to main menu.");
                return;
            }

            String selectedCategory = categoryList.get(catChoice - 1);

          
            List<FoodMenu> itemsInCategory = new ArrayList<>();
            for (FoodMenu item : MenuStore.Menu) {
                if (item.getFoodCategory().equalsIgnoreCase(selectedCategory)) {
                    itemsInCategory.add(item);
                }
            }

            System.out.println("\nItems in " + selectedCategory + ":");
            for (int i = 0; i < itemsInCategory.size(); i++) {
                FoodMenu food = itemsInCategory.get(i);
                System.out.printf("%d. %-20s ₹%.2f\n", i + 1, food.getFoodName(), food.getFoodPrice());
            }

            int itemChoice = getValidatedInput("Select item number to add to cart: ", 1, itemsInCategory.size());
            FoodMenu selectedItem = itemsInCategory.get(itemChoice - 1);

            int quantity = getValidatedInput("Enter quantity for " + selectedItem.getFoodName() + ": ", 1, 100);

            orderItems.add(new OrderItem(selectedItem.getFoodName(), selectedItem.getFoodPrice(), quantity));
            System.out.println(" Added to cart.");

            int nextStep = getValidatedInput("Do you want to (1) Add more items from another category or (2) Proceed to order? ", 1, 2);
            if (nextStep == 2) break;
        }

       
        if (orderItems.isEmpty()) {
            System.out.println(" No items in cart. Returning to main menu.");
            return;
        }

        double total = orderItems.stream().mapToDouble(OrderItem::getTotalPrice).sum();

        // Apply best discount
        DiscountManager discountManager = new DiscountManager();
        double finalAmount = discountManager.applyBestDiscount(total);
        double discount = total - finalAmount;

        // Payment
        String paymentMode;
        while (true) {
            System.out.print("Choose payment mode (1. Cash, 2. UPI): ");
            String pm = scanner.nextLine();
            if (pm.equals("1")) {
                paymentMode = "Cash";
                break;
            } else if (pm.equals("2")) {
                paymentMode = "UPI";
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        // Delivery partner assignment
        List<DeliveryPartner> availablePartners = manager.getPartners();
        if (availablePartners.isEmpty()) {
            System.out.println(" No delivery partners available. Cannot proceed with delivery.");
            return;
        }

        Random rand = new Random();
        DeliveryPartner assignedPartner = availablePartners.get(rand.nextInt(availablePartners.size()));

        // Get customer details
        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your delivery address: ");
        String customerAddress = scanner.nextLine();

        // Print invoice
        InvoicePrinter.printInvoice(orderItems, total, discount, paymentMode, assignedPartner, customerName, customerAddress);
    }

   
    private static int getValidatedInput(String prompt, int min, int max) {
        int input;
        while (true) {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(scanner.nextLine());
                if (input < min || input > max) {
                    System.out.println(" Input must be between " + min + " and " + max + ".");
                } else {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println(" Invalid input. Please enter a number.");
            }
        }
    }
}
