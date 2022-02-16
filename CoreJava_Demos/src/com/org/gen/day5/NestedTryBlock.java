package com.org.gen.day5;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p =5;
try {
	System.out.println(" Outer try blcok - block 1 ");
	try {
		 System.out.println(" inner bolck 1");
		 int arr[]= {5,10,0};
		 int res = 10/arr[0];
		 System.out.println(" result = "+res);
		 try {
			 System.out.println("inner block 2");
			 p = p/0;
			 System.out.println();
		     }catch (Exception e) {
			// TODO: handle exception
		    	 System.out.println(" line no 21 "+e);
		}
		
	     }catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
	    	 System.out.println("line no 26"+e);
	}
}catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
