package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(3);
	        numbers.add(2);
	        System.out.println("ArrayList: " + numbers);

	        
	        Iterator<Integer> iterate = numbers.iterator();

	     
	        int number = iterate.next();
	        System.out.println("Accessed Element: " + number);//1

	     
	        iterate.remove();
	        System.out.println("Removed Element: " + number);//2

	        System.out.print("Updated ArrayList: ");//1,3

	       
	        while(iterate.hasNext()) {
	            // Using the forEachRemaining() method
	            iterate.forEachRemaining((value) -> System.out.print(value + ", "));
	        }
	}

}
