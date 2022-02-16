package com.org.gen.day5;
/*try-catch
 * try-finally
 * try-catch-finally
 * */
public class CheckedException {
static int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" hello Exception ");
try {
	//Thread.sleep(1000);
	System.out.println(" stmt 1");
	x = (x/0);
	System.out.println("stmt2");
	
}catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
}
	}

}
