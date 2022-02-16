package com.org.gen.day5;

interface B{
	public void add(int x , int y );
}

class Addition{
	
	//instance method
	public void sum(int a , int b ) {
		int c = a+b;
		System.out.println("Addition = "+c);
	}
}

public class TestInstanceMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition aa = new Addition();
		
		//Lambda Expression //
		B bb = (a,b)->System.out.println(" Result = "+(a+b));
		bb.add(20, 20);

		// Instance method ref //
		B b1 = aa::sum; // instance method call by class name 
		b1.add(100, 400);
		
	}

}
