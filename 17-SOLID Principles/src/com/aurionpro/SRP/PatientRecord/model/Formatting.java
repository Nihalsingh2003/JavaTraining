package com.aurionpro.SRP.PatientRecord.model;

public class Formatting {
public void printDetails(PatientRecord patientRecord) {
	System.out.println("Patient Name:"+patientRecord.getPatientName());
	System.out.println("Doctor Name:"+patientRecord.getDoctorName());
	System.out.println("Patient age:"+patientRecord.getAge());
	System.out.println("Patient EmailId:"+patientRecord.getEmailId());
}
}
