package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListExcercise implements Cloneable {

		public static void makeSandwichList() {
			
			List<String> sandwiches = new ArrayList<>();
			
			sandwiches.add("pb&j");
			sandwiches.add("ham and cheese");
			sandwiches.add("roast beef");
			sandwiches.add("bologna");
			sandwiches.add("chicken");
			sandwiches.add("salami");
			sandwiches.add("banana");
			sandwiches.add("turkey");
			
			for (int i = 0; i < sandwiches.size(); i++) {

				System.out.println(sandwiches.get(i));
			}
			
			sandwiches.set(6, "tofu");
			sandwiches.remove(7);
			Collections.sort(sandwiches); // alphabetical order by default
			Collections.reverse(sandwiches);
			Collections.swap(sandwiches, 0, 4);
			System.out.println(sandwiches);
		}
		

		

		
		
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	

}
/*
 * create a new ArrayList add() several elements print out the entire ArrayList
 * iterate through the ArrayList and print out each element (with both normal
 * and enhanced for-loops) get() specific elements set() different elements
 * remove() elements sort() the ArrayList (try this with several object types)
 * try using the reverse(), swap() and clone() methods from the Collections
 * class
 */