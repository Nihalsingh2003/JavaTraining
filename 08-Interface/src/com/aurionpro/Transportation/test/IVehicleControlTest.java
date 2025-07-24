package com.aurionpro.Transportation.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.Transportation.model.Bike;
import com.aurionpro.Transportation.model.Car;
import com.aurionpro.Transportation.model.IVehicleControl;
import com.aurionpro.Transportation.model.Truck;

public class IVehicleControlTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IVehicleControl ivehicleControl = null;

		int operationType;
		while (true) {
			try {
				System.out.println("Please select the Transport :");
				System.out.println("1.Car");
				System.out.println("2.Bike");
				System.out.println("3.Truck");
				System.out.println("4.Exit");
				int userInput = scanner.nextInt();

				switch (userInput) {
				case 1:
					ivehicleControl = new Car();
					break;
				case 2:
					ivehicleControl = new Bike();
					break;
				case 3:
					ivehicleControl = new Truck();
					break;
				case 4:
					System.out.println("Exiting program. Goodbye!");
					return;
				default:
					System.out.println("Invalid option. Please select 1, 2,3 or 4.\n");
					continue;
				}
				boolean isTrue = false;
				while (!isTrue) {
					while (true) {
						try {
							System.out.println("Please select one option from below");
							System.out.println("1.Start");
							System.out.println("2.Stop");
							System.out.println("3.changeGear");
							System.out.println("4.EXIT");
							operationType = scanner.nextInt();
							if (operationType == 1 || operationType == 2 || operationType == 3 || operationType == 4) {
								break;
							} else {
								System.out.println("Invalid option. Please enter 1-4.\n");
							}
						} catch (InputMismatchException e) {
							System.out.println("Invalid input. Please enter an integer value." + e);
							scanner.next();
						}
					}
					if (operationType == 1) {
						ivehicleControl.start();
						isTrue = false;

					} else if (operationType == 2) {
						ivehicleControl.stop();
						isTrue = false;

					} else if (operationType == 3) {
						int gear;
						boolean isGear = false;
						while (!isGear) {
							try {

								System.out.println("Enter Gear:");
								System.out.println("1. First Gear");
								System.out.println("2. Second Gear");
								System.out.println("3. Third Gear");
								System.out.println("4. Fourth Gear");
								System.out.println("5. Exit Gear Change");

								gear = scanner.nextInt();

								switch (gear) {
								case 1:
									int changeGear1 = ivehicleControl.changeGear(gear);
									if (changeGear1 == 0) {
										isGear = true;
										break;
									}
									isGear = false;

									break;
								case 2:
									int changeGear2 = ivehicleControl.changeGear(gear);
									if (changeGear2 == 0) {
										isGear = true;
										break;
									}
									isGear = false;

									break;
								case 3:
									int changeGear3 = ivehicleControl.changeGear(gear);
									if (changeGear3 == 0) {
										isGear = true;
										break;
									}
									isGear = false;

									break;
								case 4:
									int changeGear4 = ivehicleControl.changeGear(gear);
									if (changeGear4 == 0) {
										isGear = true;
										break;
									}
									isGear = false;

									break;
								case 5:
									System.out.println("Exiting gear change menu...");
									isGear = true;
									break;
								default:
									System.out.println("Invalid gear option. Please try again.");
								}

							} catch (InputMismatchException e) {
								System.out.println("Invalid input. Please enter an integer value." + e);
								scanner.next();
							}
						}
					} else {
						break;
					}

				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer value." + e);
				scanner.next();
			}
		
		}
	}
}
