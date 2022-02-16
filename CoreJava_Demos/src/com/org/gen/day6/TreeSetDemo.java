package com.org.gen.day6;

import java.util.TreeSet;

class Book implements Comparable<Book>{
	int id ;
	String name , publisher;
	int quantity;
	public Book(int id, String name, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(quantity>o.quantity) {
			return 1;
		}else if(quantity<o.quantity) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
}
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Book> tree= new TreeSet<>();

Book b1 = new Book(101, "Java Core", "Yashwant", 10);
Book b2 = new Book(102, "Java Advance", "Mc Graw", 14);
Book b3 = new Book(103, "Spring", "Galvin", 6);
Book b4 = new Book(105,"Operating system", "Galvin" , 20);

tree.add(b1);tree.add(b2);tree.add(b3);tree.add(b4);
for(Book b : tree) {
	System.out.println(b.id+"  "+b.name+"   "+b.publisher+"   "+b.publisher+"   "+b.quantity);
}


// head set , tailset , subset

// which book is having max subscriber

//question - student class - id , name , age , fee 
// age arrange data , arrange data on the basis of fee

	}

}
