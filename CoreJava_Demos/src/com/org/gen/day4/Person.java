package com.org.gen.day4;

public class Person implements Cloneable {
	int id =0;
	String name = null;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person( 1, "AB");
		//Person p1 = (Person) p.clone();
		Person p2 = new Person(1, "AB");
		System.out.println("hashcode1 for p = "+ p.hashCode());
		//System.out.println("hashcode2 for p1 = "+p1.hashCode());
		System.out.println("hashcode3 for p2 = "+p2.hashCode());
		//System.out.println(" compare object p2 and p1 "+ p1.equals(p2));
		if(p.hashCode()==p2.hashCode()) {
			if(p.equals(p2))
				System.out.println(" bothe are equal");
			else 
				System.out.println(" not equal");
		}
		else
			System.out.println("not equal");
		}
		
	}

