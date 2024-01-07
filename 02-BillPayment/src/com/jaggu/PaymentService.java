package com.jaggu;

public class PaymentService {

	private IPayment payment;
	
	public PaymentService(IPayment payment) {
		this.payment=payment;
	}
	public IPayment getPayment() {
		return payment;
	}

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void doPayment(double billAmt) {
		boolean s=payment.processPayment(billAmt);
		if(s) {
			System.out.println("Payment Successfull...");
		}else {
			System.out.println("Payment Unsuccessfull...");
		}
	}
}
