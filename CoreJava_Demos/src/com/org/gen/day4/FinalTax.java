package com.org.gen.day4;

import java.util.Scanner;

class SalaryTax implements Tax1{

	@Override
	public int payTax1() {
		// TODO Auto-generated method stub
		return 50000;
	}
	
}
class PropertyTax implements Tax1{

	@Override
	public int payTax1() {
		// TODO Auto-generated method stub
		return 60000;
	}
	
}

public class FinalTax {
	static void countTax(Tax1 t )
	{
		int tt= 30000;
		int ss = t.payTax1();
		int total = ss+tt;
		System.out.println("Total Tax = "+ total);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Tax name");
String tax = sc.next();

Class<?> c1 = Class.forName(tax);
Tax1 t1 = (Tax1) c1.newInstance();

countTax(t1);


	}

}
