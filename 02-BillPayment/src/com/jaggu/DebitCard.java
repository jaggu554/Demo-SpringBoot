package com.jaggu;

public class DebitCard implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		if(billAmt>0) {
			System.out.println("Debit card payment Sucessfull");
			return true;
		}
		return false;
	}

}
