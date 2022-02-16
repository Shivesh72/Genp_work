package com.org.gen.day6;

import java.util.LinkedList;

public class ProductLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Product> link = new LinkedList<>();

Product p1 = new Product(1, "Laptop", "electronic", 10);
Product p2 = new Product(2, "Mobile", "Digital", 20);
Product p3 = new Product(3, "Tab", "Digital", 20);
Product p4 = new Product(4, "MacBook", "Digital", 15);

link.add(p1);link.add(p2);link.add(p3);link.add(p4);
for(Product p : link) {
	System.out.println("product id "+p.id+" Product Name "+p.pname+" Type "+p.ptype+" quantity "+p.quantity);
}



	}

}
