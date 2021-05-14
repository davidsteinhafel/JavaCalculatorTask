package com;

public class Calculator {

	public static void multiplication(double x, double y) {
		
		double result;
		
		result = x * y;
		
		System.out.println(result);
	}

	public static void subtraction(double x, double y) {
		
		double result;

		
		result = x - y;

		System.out.println(result);
	}

	public static void division(double x, double y) {
		
		double result;
		
		
		result = x / y;

		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication(5, 5);
		division(5, 5);
		subtraction(5, 20);
	}

}
