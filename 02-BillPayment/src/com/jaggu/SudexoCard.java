package com.jaggu;

public class SudexoCard implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		if(billAmt>0) {
			System.out.println("Sudexo Card payment Successfull...");
			return true;
		}
		return false;
	}

}
