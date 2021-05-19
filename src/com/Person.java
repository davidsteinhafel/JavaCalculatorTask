package com;

public class Person {
	public String name; //
	public int age; //
	public String gender; //
	public boolean isBreathing;
	public int walkSpeed = 30; // in feet
	// Constructor
	public Person(String name, int age, String gender) {
	this.name = name;
	this.age = age;
	this.gender = gender;
	}
	
	public static void read(Person person, Book book) {
		System.out.println(person.name + " is currently reading: " + book.title);
	}
	public static void pet(Person person, Dog dog) {
		System.out.println(person.name + " is petting a " + dog.breed + " that is " + dog.age + "yrs old and is a " + dog.breed);
	}
	public boolean isStillBreathing() {
	return isBreathing;
	}
	public String speak(String msg) {
	return this.name + " says: " + msg;
	}
	public int walk() {
	return walkSpeed;
	}
	
}
