package com.aurionpro.ocp.ClaimProcessor.model;

public class Vehicle implements ClaimProcessor {

	@Override
	public void claim() {
		System.out.println("Vehicle claim done");
		
	}

}
