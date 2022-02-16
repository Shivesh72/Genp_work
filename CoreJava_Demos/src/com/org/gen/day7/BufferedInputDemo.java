package com.org.gen.day7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*	Scanner s = new Scanner(System.in);
		System.out.println(" Give file name ");
		String name = s.nextLine();
FileOutputStream f = new FileOutputStream(name , true);// true for append mode 
System.out.println(" Write into the file ");
String str = s.nextLine()+"\n";
byte[] b = str.getBytes();

f.write(b);
System.out.println("success");
f.close();*/
		try {
			//pro1.txt is having one line -->  static void main(String args[])
			 FileInputStream f = new FileInputStream("D:\\pro1.txt");
			 BufferedInputStream fs = new BufferedInputStream(f);
			 
			 //fs.skip(50);
			System.out.println((char)fs.read());
			System.out.println((char)fs.read());
			System.out.println((char)fs.read());
			System.out.println((char)fs.read());
			System.out.println((char)fs.read());
			fs.mark(0);
			System.out.println("char "+(char)fs.read());
			System.out.println("char "+(char)fs.read());
			System.out.println(" reset invocked");
			fs.reset();
			System.out.println("char "+(char)fs.read());
			System.out.println("char "+(char)fs.read());
			 int i = fs.read();
			 while (i!=-1) {
				 System.out.print((char)i);
				 i=fs.read();
			 }fs.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}



	}

 
}
