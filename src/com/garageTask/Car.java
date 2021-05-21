package com.garageTask;

import java.util.ArrayList;

public class Car implements Garage {
	private int id;
	private String model;
	private int wheels;
	private int seats;
	private boolean inGarage;
	private double cost;
	private int year;

	public Car(int id, String model, int year, int wheels, int seats, int cost) {
		this.model = model;
		this.wheels = wheels;
		this.seats = seats;
		this.cost = cost;

	}

	public ArrayList<Car> addCar(ArrayList<Car> carList, Car car) {
		carList.add(car);
		return (carList);
	}

	public void priceChecker(ArrayList<Car> carList) {
		double newCost;
		newCost = 0;

		for (Car car : carList) {

			car.cost = 1500;
			if (car.seats >= 2 & car.seats < 4) {
				car.cost += 1000;
			} else if (car.seats >= 4) {
				car.cost += 3000;
			} else {
				car.cost -= 500;
			}
			if (car.year >= 2000 & car.year < 2010) {
				car.cost += 1000;
			} else if (car.year >= 2010) {
				car.cost += 2000;
			} else {
				car.cost -= 500;
			}
			if (car.wheels == 2) {
				car.cost -= 500;
			} else if (car.wheels > 2 & car.wheels <= 4) {
				car.cost += 1500;
			} else {
				car.cost += 3000;
			}
			System.out.println(car.model + " is worth: " + newCost);
			newCost = car.cost;
		}
	}

	public void fixCar(Car car, int problem) {
		int theProblem = problem;
		switch (theProblem) {
		case 1:
			System.out.println("you owe $200 for a new tire");
			break;
		case 2:
			System.out.println("you owe $30 for the oil change");
			break;
		case 3:
			System.out.println("you owe $500 for fixing a cracked windshield");
			break;
		}
	}
	public void removeCarId(ArrayList<Car> carList, int Id) {
		for(Car car : carList) {
			if(car.id == id) {
				carList.remove(car);
			}
			else {
				System.out.println("Sorry we couldnt find your vehicle. Please check you have the right id");
			}
		}
	}
	public void removeCarModel(ArrayList<Car> carList, String model) {
		
	}
}
