package com.aurionpro.ocp.ClaimProcessor.model;

public class Health implements ClaimProcessor {

	@Override
	public void claim() {
		System.out.println("Healt claim done");
		
	}

}
