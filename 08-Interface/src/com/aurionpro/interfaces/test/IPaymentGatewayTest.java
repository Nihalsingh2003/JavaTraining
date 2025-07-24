package com.aurionpro.interfaces.test;

import com.aurionpro.interfaces.model.IPaymentGateway;
import com.aurionpro.interfaces.model.PayPal;
import com.aurionpro.interfaces.model.Razorpay;
import com.aurionpro.interfaces.model.Stripe;

public class IPaymentGatewayTest {
public static void main(String[] args) {
	IPaymentGateway[] ipaymentGateway =new IPaymentGateway[3];
	ipaymentGateway[0]=new PayPal();
	ipaymentGateway[1]=new Razorpay();
	ipaymentGateway[2]=new Stripe();
	for(IPaymentGateway result:ipaymentGateway) {
		result.processPayment();
	}
	
}
}
