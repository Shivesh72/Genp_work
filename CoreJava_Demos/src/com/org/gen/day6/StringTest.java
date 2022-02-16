package com.org.gen.day6;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String email = "nishi.verma112@gmail.com";

String deptid = "CDB22X092";

System.out.println(" Full stack batches => "+deptid.startsWith("CDB"));

System.out.println(" Full stack batch => "+deptid.startsWith("CDB", 0));

System.out.println(" year 22 is there ??"+ deptid.substring(3,5));

System.out.println("Please check the email => @genpact.com ");
if(email.endsWith("@genpact.com")) {
	System.out.println(" yes it is ");
}
else 
	System.out.println(" it is not ");
}
	}


