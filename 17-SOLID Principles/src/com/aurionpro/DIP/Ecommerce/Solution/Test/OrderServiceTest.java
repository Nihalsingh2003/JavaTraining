package com.aurionpro.DIP.Ecommerce.Solution.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.DIP.Ecommerce.Solution.model.EmailSender;
import com.aurionpro.DIP.Ecommerce.Solution.model.OrderService;
import com.aurionpro.DIP.Ecommerce.Solution.model.PushNotifier;
import com.aurionpro.DIP.Ecommerce.Solution.model.SMSSender;
import com.aurionpro.DIP.Ecommerce.Solution.model.WhatsApp;

public class OrderServiceTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isTrue = false;
		while (!isTrue) {
			try {
				OrderService service = null;
				while (true) {
					System.out.println("Please Enter choice 1-5");
					System.out.println("1.Send Email");
					System.out.println("2.Send SmS");
					System.out.println("3.Send PushNotification");
					System.out.println("4.Send WhatsApp Notification");
					System.out.println("5.Exit");
					int userInput = scanner.nextInt();
					
					switch (userInput) {
					case 1:
						service = new OrderService(new EmailSender());
						break;
					case 2:
						service = new OrderService(new SMSSender());
						break;
					case 3:
						service = new OrderService(new PushNotifier());
						break;
					case 4:
						service = new OrderService(new WhatsApp());
						break;
					case 5:
						System.out.println("Exiting Program Byee!!");
						return;
					default:
						System.out.println("Invalid option. Please select 1-5.");
						continue;

					}
					service.send();
				}

			} catch (InputMismatchException e) {
				System.out.println("Please Enter only Integer" + e);
				scanner.next();
			}

		}

	}
}
