package com;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result.examOverall();
		Result.passing();
		Result.displayResults();

		Scanner in = new Scanner(System.in);
		 
        String s = in.nextLine();
        System.out.println("You entered string " + s);
        
        in.close();
	}

}
