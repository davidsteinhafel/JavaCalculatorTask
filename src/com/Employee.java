package com;
import java.util.ArrayList;
import java.util.List;


public class Employee {
	private String name;
	private String employeeRole;
	private int employeeId;
	private double annualSalary;
	private double weeklySalary;
	
	
	public Employee(String name, String employeeRole, int employeeId, double annualSalary, double weeklySalary) {
		this.name = name;
		this.employeeRole = employeeRole;
		this.employeeId = employeeId;
		this.annualSalary = (annualSalary);
		this.weeklySalary = calculateWeeklySalary(annualSalary, weeklySalary);
		
		
	}
	
	public static double calculateWeeklySalary(double annualSalary, double weeklySalary) {
		
		weeklySalary = annualSalary / 52;
		
		return(weeklySalary);
	}
	public Employee createEmployee(String name, String employeeRole, int employeeId) {
		
		Employee employee = new Employee(name, employeeRole, employeeId, getAnnualSalary(), weeklySalary);
		
		return(employee);
		
		
		
	}
	public List<Employee> addEmployee(Employee employee) {
		
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(employee);
		
		return(employeeList);
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	

}
