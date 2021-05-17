package com;

public class Result {
	public static double Physics = 84;
	public static double Chemistry = 150;
	public static double Biology = 84;
	public static double total = Physics + Chemistry + Biology;
	public static double percentage;

	public static void displayResults() {
		System.out.println("\nPhysics Mark:" + Physics);
		System.out.println("Chemistry Mark: " + Chemistry);
		System.out.println("Biology Mark: " + Biology);
		System.out.println("\nOverall Mark: " + total);
		System.out.println("\nYour percent was: " + examOverall());
	}

	public static double examOverall() {

		return percentage = total * 100 / 450;

	}
	public static double classOverall(double num1) {

		return percentage = num1 * 100 / 150;

	}

	public static void passing() {
		double tot = examOverall();
		double phy = classOverall(Physics);
		double chem = classOverall(Chemistry);
		double bio = classOverall(Biology);

		if (tot < 60) {
			System.out.println("You failed due to your Overall mark");
		} 
		else if (phy < 60) {
			if(chem < 60) {
				System.out.println("\nYou failed due to your Chemistry mark ");
			}
			else {
				System.out.println("You failed due to your Biology Mark");
			}
			System.out.println("You failed due to your Physics mark");
		}
		else if(chem < 60) {
			if(bio < 60) {
				System.out.println("\nYou failed due to your Biology Mark");
			}
			System.out.println("You failed due to your Chemistry mark");
		}
		else if(bio < 60) {
			System.out.println("You failed due to your Biology Mark");
		}
		else {
			System.out.println("Congrats on passing!");
		}
	}

}

// Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.

// Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.

// example: if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84

// they would have an overall grade of 85.3% (Pass)

// but in this case the student would fail because their physics grade is 54% (Fail)

// Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.
