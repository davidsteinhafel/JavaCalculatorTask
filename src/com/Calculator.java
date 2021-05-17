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

	public static double division(double x, double y) {

		if (y > x) {

			System.out.println("Division cannot be performed!!!");

			return (0);

		} else {
			
			System.out.println(x / y);
			
			return x / y;

		}

	}

}
