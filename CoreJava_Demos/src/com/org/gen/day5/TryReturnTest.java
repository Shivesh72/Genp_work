package com.org.gen.day5;

public class TryReturnTest {

	int m1() {
		try {
			System.out.println(" try block");
			return 100;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(" catch block ");
			return 200;
		}
		finally {
			System.out.println(" finally block ");
			return 500;
		}
		
		//System.out.println(" code ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TryReturnTest tr = new TryReturnTest();
      System.out.println( tr.m1());
	}

}
