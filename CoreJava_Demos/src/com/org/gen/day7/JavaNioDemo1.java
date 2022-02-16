package com.org.gen.day7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNioDemo1 {

	private Path path;
	public static void main(String[] args) {
		 JavaNioDemo1 exp = new JavaNioDemo1();
		 exp.createPath();
		 exp.getPathInfo();
		 exp.convertPaths();
		 exp.coparePaths();
	
		 
	}
	private void coparePaths() {
		// TODO Auto-generated method stub
		Path path2 = Paths.get("D:\\Nishi\\stripdata\\Genpact\\jsp.txt");
		boolean check = path2.equals(path);
		System.out.println(" Are these two path are equal ? "+check);
		
	}
	private void convertPaths() {
		// TODO Auto-generated method stub
		Path relative = Paths.get("day4.txt");
		System.out.println(" relative path : "+relative);
		Path absolute = relative.toAbsolutePath();
		System.out.println("Absolute path : "+absolute);
		
	}
	private void getPathInfo() {
		// TODO Auto-generated method stub
		Path filename = path.getFileName();
		System.out.println("File name = "+filename);
		Path name1= path.getName(0);
		System.out.println("Name 0 : "+name1);
		Path sub = path.subpath(0, 2);
		System.out.println("sub Path : "+sub);
		
	}
	private void createPath() {
		// TODO Auto-generated method stub
		path = Paths.get("D:\\Nishi\\stripdata\\Genpact\\jsp.txt");
		System.out.println(" path created  : "+ path.toString());
	}
}
