package com.garageTask;

public abstract class Vehicle {
	 
 	protected int id;
	protected String model;
	protected String make;
	protected int wheels;
	protected int seats;
	protected double cost;
	protected int year;

	public Vehicle(int id, String model, String make, double cost, int year) {
		this.id = id;
		this.model = model;
		this.make = make;
		this.cost = cost;
		this.year = year;

	}
	
}
