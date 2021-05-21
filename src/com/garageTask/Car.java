package com.garageTask;

public class Car extends Vehicle {
	
	private boolean isElectric;

	public Car(int id, String model, String make, double cost, int year, boolean isElectric) {
		super(id, model, make, cost, year);
		isElectric = false;
	}


}
