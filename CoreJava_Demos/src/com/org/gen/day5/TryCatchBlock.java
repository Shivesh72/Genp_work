package com.org.gen.day5;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("11");
System.out.println("Before divide ");
try {
	
	int x = 1/0;
	System.out.println(" after devide");
}catch (Exception e) {
	// TODO: handle exception
	System.out.println("A number is dividing by zero "+e);
}
System.out.println("22");
	}

}
