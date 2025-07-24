package com.aurionpro.SRP.PatientRecord.model;

public class PatientRecord {
	private String patientName;
	private String doctorName;
	private String emailId;
	private int age;

	public PatientRecord(String patientName, String doctorName, String emailId, int age) {
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.age = age;
		this.emailId = emailId;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public String getEmailId() {
		return emailId;
	}

	public int getAge() {
		return age;
	}

}
