package com.org.gen.day7;

import java.io.FileOutputStream;

public class FileOutPutStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data = " Reading the data from the file and writing by machine ";
try {
	
	FileOutputStream out = new FileOutputStream("D://outstream.txt");
	
	byte[] arr = data.getBytes();
	
	out.write(arr);
	System.out.println(" done !!!");
	
	out.close();
	
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
