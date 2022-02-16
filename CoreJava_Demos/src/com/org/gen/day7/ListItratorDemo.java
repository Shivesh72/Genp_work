package com.org.gen.day7;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(3);
	        numbers.add(2);
	        System.out.println("ArrayList: " + numbers);
	        ListIterator<Integer> itr= numbers.listIterator();
	        itr.next();
	        itr.next();
	        
	        int number1 = itr.next();
	        System.out.println(" Next element = "+number1);
	        
	        int index1 = itr.nextIndex();
	        System.out.println("position of next element "+ index1);
	        
	        System.out.println(" Is there any next element ?? "+itr.hasNext());
	}

}
