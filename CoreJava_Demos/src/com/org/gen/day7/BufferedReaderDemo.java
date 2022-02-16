package com.org.gen.day7;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] arr = new char[100];

try {
	FileReader file = new FileReader("D://outstream.txt");
	
	BufferedReader bb = new BufferedReader(file);
	
	bb.read(arr);
	System.out.println(" Data in the file");
	System.out.println(arr);
	bb.close();
	
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
