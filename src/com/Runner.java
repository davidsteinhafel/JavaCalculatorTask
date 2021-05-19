package com;


public class Runner {

	public static void main(String[] args) {
		
		Person David = new Person("David", 30, "Male");
		Book book1 = new Book("Oh, the Places You'll Go!", " Dr. Suess", false);
		Dog dog1 = new Dog("Spike", "Border Collie", 4);
		
		
		Result.examOverall();
		Result.displayResults();
		arrayTask.displayArray();
		arrayTask.arrayMaker();
		JavaStrings.displayCompleted();
		Person.read(David, book1);
		Person.pet(David, dog1);
		
	}

}
