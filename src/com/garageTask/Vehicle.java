package com.garageTask;

public abstract class Vehicle {
	 
 	protected int id;
	protected String model;
	private String make;
	private int wheels;
	private int seats;
	protected double cost;
	private int year;

	public Vehicle(int id, String model, String make, double cost, int year) {
		this.id = id;
		this.model = model;
		this.make = make;
		this.cost = cost;
		this.year = year;

	}
	
}
