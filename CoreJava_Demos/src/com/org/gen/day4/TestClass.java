package com.org.gen.day4;
class ComapreClass{
	int id; String name ;

	public ComapreClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj)
		return true;
		if(obj == null || obj.getClass()!= this.getClass())
			return false;
		ComapreClass cc = (ComapreClass)obj;
		return (cc.name == this.name && cc.id == this.id);
	}
	
}

public class TestClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComapreClass c1 = new ComapreClass(1, "1");
		ComapreClass c2 = new ComapreClass(1, "1");
		if(c1.hashCode()==c2.hashCode()) {
			if(c1.equals(c2))
				System.out.println(" equal");
			else
				System.out.println(" not equal");
		}
		else 
			System.out.println(" not equal ");
		}
	}


