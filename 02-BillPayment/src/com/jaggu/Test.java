package com.jaggu;

public class Test {

	public static void main(String[] args) {
		
		PaymentService service=new PaymentService(null);
		service.setPayment(new CreditCard());
		service.doPayment(0);
	}
}
