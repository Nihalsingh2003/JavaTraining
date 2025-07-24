package com.aurionpro.ocp.ClaimProcessor.model;

public class Life implements ClaimProcessor {

	@Override
	public void claim() {
		System.out.println("Life insurance claim done");
		
	}

}
