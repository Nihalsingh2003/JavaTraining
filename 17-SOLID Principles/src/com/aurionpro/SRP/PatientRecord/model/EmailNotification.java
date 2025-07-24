package com.aurionpro.SRP.PatientRecord.model;

public class EmailNotification {
	public void sendMail(PatientRecord patientRecord) {
		System.out.println("Sending Mail to :"+patientRecord.getPatientName());
	}
}
