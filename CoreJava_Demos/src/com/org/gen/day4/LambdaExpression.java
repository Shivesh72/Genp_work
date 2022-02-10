package com.org.gen.day4;

interface Myinterface{
	public String print(String data);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myinterface m1 = (data)->{System.out.println(" Lambda expression ");
                           return "My Data" + data ;
                          };
String s = m1.print(" Java ");
System.out.println(" Data is here "+ s);
System.out.println(m1.print("java"));
}
}