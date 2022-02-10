package com.org.gen.day4;

import java.util.Date;

public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Date date = new Date();
      
      System.out.println(date.toString());
      Date date2 = (Date) date.clone();
      System.out.println(date2.toString());
      
      System.out.println(date.clone() != date );
      
      System.out.println(date.clone().getClass()== date.getClass());
      
      System.out.println(date.clone().equals(date));
      
	}

}
