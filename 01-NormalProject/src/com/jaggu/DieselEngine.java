package com.jaggu;

public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Diesel engine Stated");
		return 1;
	}

}
