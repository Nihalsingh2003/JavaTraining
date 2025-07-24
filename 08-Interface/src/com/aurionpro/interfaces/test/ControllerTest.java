package com.aurionpro.interfaces.test;

import com.aurionpro.interfaces.model.Fan;
import com.aurionpro.interfaces.model.IController;
import com.aurionpro.interfaces.model.Light;
import com.aurionpro.interfaces.model.Speaker;
import com.aurionpro.interfaces.model.TV;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControllerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {

				System.out.println("Device Controller Menu");
				System.out.println("Select a device to control (1-5): ");
				System.out.println("1. Light");
				System.out.println("2. Fan");
				System.out.println("3. TV");
				System.out.println("4. Speaker");
				System.out.println("5. Exit");
				int deviceChoice = scanner.nextInt();

				IController controller = null;
				String[] modes = {};

				switch (deviceChoice) {
				case 1:
					controller = new Light();
					modes = new String[] { "Dim", "Bright" };
					break;
				case 2:
					controller = new Fan();
					modes = new String[] { "Low", "Medium", "High" };
					break;
				case 3:
					controller = new TV();
					modes = new String[] { "SD", "HD", "4K" };
					break;
				case 4:
					controller = new Speaker();
					modes = new String[] { "Bass", "Treble", "Vocal" };
					break;
				case 5:
					System.out.println("Exiting program. Goodbye!");
					return;
				default:
					System.out.println("Invalid device selection! Try again.");
					continue;
				}

				System.out.println("Available Modes:");
				int modeChoice = 0;
				while (true) {
					try {
						System.out.println("Select a mode (1-" + modes.length + "): ");
						for (int i = 0; i < modes.length; i++) {
							System.out.println((i + 1) + ". " + modes[i]);
						}

						modeChoice = scanner.nextInt();
						scanner.nextLine();

						if (modeChoice < 1 || modeChoice > modes.length) {
							System.out.println("Invalid mode selection! Returning to main menu.");
							continue;
						} else {
							break;
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input. Please enter an integer value." + e);
						scanner.next();
					}

				}

				String selectedMode = modes[modeChoice - 1];

				controller.turnOn();
				controller.setMode(selectedMode);
				controller.turnOff();
				System.out.println("-------------------------------------");

			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer value." + e);
				scanner.next();
			}
		}
	}
}
