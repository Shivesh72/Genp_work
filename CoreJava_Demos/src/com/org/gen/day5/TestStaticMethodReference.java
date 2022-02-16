package com.org.gen.day5;
interface A1 {
	public boolean checkSingleDigit(int x);
}

class Digit {
	public static boolean isSingleDigit(int x) {
	    return x > -10 && x < 10;
	}
}
public class TestStaticMethodReference {
public static void main(String[] args) {
		
		//*** Using Lambda Expression ***//
		A1 a1 = (x) -> { return x > -10 && x < 10;};
		System.out.println(a1.checkSingleDigit(10));
		
		//*** Using Method Reference ***//
		A1 a2 = Digit::isSingleDigit;
		System.out.println(a2.checkSingleDigit(9));
	}
}
