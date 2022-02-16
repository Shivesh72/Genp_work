package com.org.gen.day5;
//when system.exit() is invoked before executing finally

//when exception is in finally

//when return statement is declared in the finally block 

public class FinallyBlockDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("101");
	System.out.println("102");
	System.out.println(200/0);
}catch (Exception e) {
	// TODO: handle exception
	System.out.println(100/0);
}
finally {
	System.out.println(102/0);
	System.out.println("444");
}
	}

}
