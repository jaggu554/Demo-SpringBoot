package com.jaggu;

public class Test {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setIEngine(new PetrolEngine());
		c.drive();
	}
}
