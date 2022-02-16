package com.org.gen.day5;

public class TryCatchBlock1 {
int x = 30 , y=0;
void divide() {
	System.out.println(" I am a method ");
	try {
		System.out.println(" Inside try block");
		int z = x/y;
	}catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println(" I  am in catch blcok "+e);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TryCatchBlock1 tb = new TryCatchBlock1();
System.out.println(" I am in Main method");
tb.divide();
	}

}
