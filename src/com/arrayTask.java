package com;
import java.util.ArrayList;

public class arrayTask {
	public static int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	
	public static void displayArray() 
	{
		for(int i : numArray){
			System.out.println("number: " + i);
			
		}
	}
	
	public static void arrayMaker() 
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i <= 10; ++i) 
		{
			int x;
			x = i;
			x *= 10;
			System.out.println(x);
			numbers.add(x);
			
		}
		System.out.println(numbers);
	}
	

}
/*
 * Create an array that will hold 10 integer values, populate the array with
 * values, then call and output each element. Create a for loop that populates
 * an integer array with values, outputting them at each iteration. Then create
 * another loop that iterates through the array, changing the values at each
 * point to equal itself times 10, outputting them at each iteration.
 */
