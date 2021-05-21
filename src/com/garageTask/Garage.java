package com.garageTask;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicleList;

	public Garage(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public ArrayList<Vehicle> addVehicle(ArrayList<Vehicle> vehicleList, Vehicle vehicle) {

		vehicleList.add(vehicle);
		System.out.println("You successfully added a " + vehicle + " to the list of vehicles in the garage");
		return (vehicleList);
	}

	public static void fixCar(Vehicle vehicle) {

	}

	public void fixCar(Vehicle vehicle, int problem) {

		switch (problem) {
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

	public void removeCarId(ArrayList<Vehicle> vehicleList, int Id) {
		for (Vehicle vehicle : vehicleList) {
			if (vehicle.id == Id) {
				vehicleList.remove(vehicle);
				System.out.println(vehicle.id + " has been removed!");
			} else {
				System.out.println("Sorry we couldnt find your vehicle. Please check you have the right id");
			}
		}
	}

	public void removeCarModel(ArrayList<Vehicle> carList, String model) {
		for (Vehicle vehicle : vehicleList) {
			if (vehicle.model == model) {
				vehicleList.remove(vehicle);
				System.out.println(vehicle.model + " has been removed!");
			} else {
				System.out.println("Make sure you've given us the correct model name");
			}
		}
	}

	public void priceChecker(ArrayList<Vehicle> vehicleList) {
		double newCost;
		newCost = 0;

		for (Vehicle vehicle : vehicleList) {

			vehicle.cost = 1500;

			if (vehicle.seats > 0 & vehicle.seats < 4) {
				vehicle.cost += 1000;
			}

			else if (vehicle.seats >= 4) {
				vehicle.cost += 3000;
			} else {
				vehicle.cost -= 500;
			}
			if (vehicle.year >= 2000 & vehicle.year < 2010) {
				vehicle.cost += 1000;
			} else if (vehicle.year >= 2010) {
				vehicle.cost += 2000;
			} else {
				vehicle.cost -= 500;
			}
			if (vehicle.wheels == 2) {
				vehicle.cost -= 500;
			} else if (vehicle.wheels > 2 & vehicle.wheels <= 4) {
				vehicle.cost += 1500;
			} else {
				vehicle.cost += 3000;
			}
			newCost = vehicle.cost;
			System.out.println(vehicle.model + " is worth: " + newCost);
			
		}
	}
}
