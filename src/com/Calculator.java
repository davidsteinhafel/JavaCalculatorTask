package com;

public class Calculator {
	
	public static void multiplication(int x, int y) {
		int first;
		int second;
		
		first = x;
		second = y;
		
		System.out.println(first * second);
	}
	
	public static void subtraction(int x, int y) {
		int first;
		int second;
		
		first = x;
		second = y;
		
		System.out.println(first - second);
	}
	
	public static void division(int x, int y) {
		int first;
		int second;
		
		first = x;
		second = y;
		
		System.out.println(first % second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication(5, 5);
		division(5, 5);
		subtraction(5, 20);
	}

}
