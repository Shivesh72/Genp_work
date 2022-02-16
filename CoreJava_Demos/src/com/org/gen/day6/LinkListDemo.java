package com.org.gen.day6;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> link = new LinkedList<>();
link.add("Ramesh");link.add("Vijay");link.add("Aman");link.add("Virat");link.add("harsha");link.add("Amit");
int size = link.size();
String [] name = new String[size];

 name = link.toArray(name);
System.out.println(" elements of array -> ");
System.out.println(Arrays.toString(name));
	}

}
