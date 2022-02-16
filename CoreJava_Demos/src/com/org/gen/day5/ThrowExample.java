package com.org.gen.day5;

public class ThrowExample {

	static void CheckData(int x , int y )
	{
	   if(x<15 && y<30) {
		   throw new ArithmeticException(" Student is not eligible for registration s");
	   }
	   else{
		   System.out.println("Student entry if valid ");
	   }
	
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			System.out.println(" welcome ");
			CheckData(2, 29);
			System.out.println(" done!!!");

	}

}
