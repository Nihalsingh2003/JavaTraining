package com.aurionpro.LSP.Ecommerce.solution.model;

public class NoDiscount implements IDiscount {

	@Override
	public void getDsicount() {
		System.out.println("0% discount");
		
	}

}
