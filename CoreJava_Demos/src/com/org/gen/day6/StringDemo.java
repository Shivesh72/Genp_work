package com.org.gen.day6;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "hello" ; String s2 = "hello";String s3 = "HELLO";
String s4 = new String ("hello");
String s6 ="Hemlo"; String s5="flag";
System.out.println(s1.compareTo(s3));
System.out.println(s1.compareTo(s4));
System.out.println(s1.compareTo(s5));
System.out.println(s3.isEmpty());
System.out.println("xyz".isBlank());//false
System.out.println(" ".isBlank());//true
System.out.println("aaa".isEmpty());//false
System.out.println(" ".isEmpty());//false
System.out.println(s1+"=="+s3 +(s1==s3));
System.out.println(s2+" == "+s3+(s2==s3));
System.out.println("line 20"+(s1==s4));
System.out.println(s1.equals(s4));
System.out.println(s1.length() +"    "+ s2.length());
	}

}
