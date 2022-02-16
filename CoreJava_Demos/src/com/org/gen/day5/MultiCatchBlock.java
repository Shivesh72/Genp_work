package com.org.gen.day5;

public class MultiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Exception class";
		 int a[]= {0,1,2,3,4,5};
   try {
	   int arr[] = new int[7];
	  // arr[10] = 10/5;
	  s = null ;
	//  int slength = s.length();
	  //System.out.println(" length = "+slength);
	  int b = 6 ;System.out.println(a[b]);
	   System.out.println(" Last statement of try block");
   }catch (ArithmeticException e) {
	// TODO: handle exception
	   System.out.println(" You shold not divide a number by zero ");
     }catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
    	 System.out.println(" Accessing array elements outside of the limit");
	}catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("Exception caugth");
	}
   
   
   catch (Exception e) {
		// TODO: handle exception
		System.out.println(" Some other excp");
	}
   System.out.println(" out of the try catch ");
	}

}
