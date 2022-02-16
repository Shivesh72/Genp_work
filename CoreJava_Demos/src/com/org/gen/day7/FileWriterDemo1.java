package com.org.gen.day7;

import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileWriterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String file = "D://outstream.txt";
try {
	FileWriter out1 = new FileWriter(file);
	FileWriter out2 = new FileWriter(file, Charset.forName("UTF8"));
	
	System.out.println("charcter encoding of out1 "+out1.getEncoding());
	System.out.println("charecter encoding of out2 "+out2.getEncoding());
	out1.close();out2.close();
	
	
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
