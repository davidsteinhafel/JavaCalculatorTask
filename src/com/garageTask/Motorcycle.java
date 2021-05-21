package com.garageTask;

public class Motorcycle extends Vehicle {
	
	private boolean hasSaddleBags;
	
	public Motorcycle(int id, String model, String make, double cost, int year, boolean hasSaddleBags) {
		super(id, model, make, cost, year);
		hasSaddleBags = true;
	}




	
}
