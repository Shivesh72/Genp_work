package com.org.gen.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] arr = new byte[100];

try {
	FileInputStream  file = new FileInputStream("D://pro1.txt");
	System.out.println(" availabale bytes in the file "+ file.available());
	int i = file.read();
	System.out.println(" read the file data ");
	System.out.println((char)i);
	
	file.read(arr);
	System.out.println(" data read from the file ");
	String data = new String(arr);
	System.out.println(data);
	
	file.close();
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
