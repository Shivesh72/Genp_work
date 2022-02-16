package com.org.gen.day6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> animals = new ArrayList<>();

animals.ensureCapacity(4);

animals.add("Dog");animals.add("pig");animals.add("Cat");animals.add("Horse");animals.add(0, "Duck");animals.add("Dog");
System.out.println(" Arraylist -> "+ animals);
System.out.println(" Dog id present in list ? "+animals.contains("Dog"));

	}

}
