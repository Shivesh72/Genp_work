package com.org.gen.day3;

public class ExternalClass {

	private void getData() {
		int sum = 100;
		class Internal{
			public int a ;
			public int b ;
			public Internal() {
				super();
				// TODO Auto-generated constructor stub
				a=10;
				b=sum%a;
			}
			private int getResult() {
				return a ;
			}
			private int getB() {
				return sum%a;
			}
			
		}
		Internal in = new Internal();
		System.out.println(" A= "+in.getResult());
		System.out.println("B = "+in.getB());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExternalClass e = new ExternalClass();
e.getData();
	}

}
