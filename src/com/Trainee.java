package com;
import java.util.List;
import com.Employee;


public class Trainee extends Employee {
	
	private double bursary;
	private static List<String> subjectsLearned;
	

	
	public Trainee(String name, String employeeRole, int employeeId, double bursary, List<String> subjectsLearned) {
		
		super(employeeRole, employeeRole, employeeId, bursary, calculateWeeklySalary(0, 0));
		
		
		bursary = 0;
	}
	
	public static void addSubject(String subject) {
		
		subjectsLearned.add(subject);
		
	}
	
}