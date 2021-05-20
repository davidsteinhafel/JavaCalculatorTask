package com;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String employeeRole;
	private int employeeId;
	private double annualSalary;
	List<Employee> employeeList = new ArrayList<>();

	private double weeklySalary;

	public Employee(String name, String employeeRole, int employeeId, double annualSalary, double weeklySalary) {
		this.name = name;
		this.employeeRole = employeeRole;
		this.employeeId = employeeId;
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary(annualSalary);

	}

	public static double calculateWeeklySalary(double annualSalary) {

		double calcSalary = annualSalary / 52;

		return (calcSalary);
	}

	public Employee createEmployee(String name, String employeeRole, int employeeId, double annualSalary, double weeklySalary) {

		Employee employee = new Employee(name, employeeRole, employeeId, annualSalary, weeklySalary);

		return (employee);

	}

	public List<Employee> addEmployee(Employee employee, List<Employee> employeeList) {

		employeeList.add(employee);

		return (employeeList);
	}

	public List<Employee> removeEmployee(List<Employee> employeeList, int index) {
		employeeList.remove(index);
		
		return (employeeList);
	}

	

}
