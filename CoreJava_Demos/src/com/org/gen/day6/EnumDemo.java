package com.org.gen.day6;

import java.util.EnumSet;

enum Weekdays{
	Monday , Tusday, Wednesday , Thorsday , Friday , satur, Sunday
}
enum Size{
	Small , Xsmall , Medium , Large , ExtraLarge 
}
class Test{
	Size PizzaSize;

	public Test(Size pizzaSize) {
		super();
		PizzaSize = pizzaSize;
	}
	public void order() {
		switch (PizzaSize) {
		case Small: 
			System.out.println(" I orderd a small size pizza");
			break;
		case Medium :
			System.out.println(" Medioum size pizza with cocke ");
			break ;
			
		default:
			throw new IllegalArgumentException("Not available : " + PizzaSize);
		}
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<Weekdays> week = EnumSet.allOf(Weekdays.class);
	
		EnumSet<Weekdays> week1 = EnumSet.noneOf(Weekdays.class);
		week1.add(Weekdays.Monday);
		EnumSet<Weekdays> week2 = EnumSet.range(Weekdays.Tusday, Weekdays.Friday);
		System.out.println(" Range "+week2);
		System.out.println(" Weekdays are "+ week);
		System.out.println(" weekdays none -"+ week1);
		EnumSet<Weekdays> w1 = EnumSet.of(Weekdays.Monday);
		EnumSet<Weekdays> w2 = EnumSet.of(Weekdays.Tusday,Weekdays.Wednesday, Weekdays.Sunday);
		System.out.println(" set 1 = "+w1 +" set 2 = "+ w2);
		Test   t = new Test(Size.Medium);
		t.order();
		
System.out.println(Size.ExtraLarge);
System.out.println(Weekdays.Wednesday);
	}

}
