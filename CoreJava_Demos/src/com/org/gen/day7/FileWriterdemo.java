package com.org.gen.day7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileWriterdemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String file3 = "D://outstream.txt";
		String data = " This is the string for my file ";
		try {
	FileWriter  file = new FileWriter("D://outstream.txt");
	BufferedWriter out = new BufferedWriter(file);
	
	out.write(data);
	out.flush();
	System.out.println(" data is flushed to the file"); 
	
	
	
	out.close();
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
