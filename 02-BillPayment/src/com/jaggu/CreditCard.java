package com.jaggu;

public class CreditCard implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		if(billAmt>0) {
			System.out.println("Credit card Payment Successfull...");
			return true;
		}
		return false;
	}

}
