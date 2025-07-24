package com.aurionpro.SRP.PatientRecord.Test;

import java.util.Scanner;

import com.aurionpro.SRP.PatientRecord.model.EmailNotification;
import com.aurionpro.SRP.PatientRecord.model.Formatting;
import com.aurionpro.SRP.PatientRecord.model.PatientRecord;

public class PatientRecordTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter patient Name:");
		String patientName = scanner.nextLine();
		System.out.println("Please enter Doctor Name:");
		String doctorName = scanner.nextLine();
		System.out.println("Please enter patient EmailId:");
		String patientEmailId = scanner.nextLine();
		System.out.println("Please enter patient age:");
		int patientAge = scanner.nextInt();
		
		PatientRecord patientRecord=new PatientRecord(patientName, doctorName, patientEmailId, patientAge);
		EmailNotification email=new EmailNotification();
		email.sendMail(patientRecord);
		Formatting format=new Formatting();
		format.printDetails(patientRecord);

	}
}
