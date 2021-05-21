package com.garageTask;

public class Truck extends Vehicle{
	
	private boolean hasTrailerHitch;
	private boolean hasPickupBed;
	
	public Truck(int id, String model, String make, double cost, int year, boolean hasTrailerHitch, boolean hasPickupBed) {
		super(id, model, make, cost, year);
		hasTrailerHitch = true;
		hasPickupBed = true;
	}
	


	

}
