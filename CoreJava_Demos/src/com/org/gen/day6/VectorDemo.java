package com.org.gen.day6;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> v = new Vector<>();
v.add("Dog");v.add("Horse");
Vector<String> v1 = new Vector<>();
v1.add("Duck");v1.add("Cow");v1.add("Cat");
v1.add("Sheep");

v.addAll(1, v1);
System.out.println(" complete data - "+v);
System.out.println(v.get(2));

Iterator<String> itr = v.iterator();
System.out.println(" Vector : ");
while(itr.hasNext()) {
	System.out.println(itr.next());
	System.out.println("  ");
}




	}

}
