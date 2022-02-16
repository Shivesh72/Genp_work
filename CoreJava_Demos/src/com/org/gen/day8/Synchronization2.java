package com.org.gen.day8;

class Thread11 extends Thread{
	int total ;
	public void run() {
	synchronized (this) {
		for(int i =0;i<=10;i++) {
			total +=i;
		}notify();
	}
	}
}

public class Synchronization2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread11 b = new Thread11();
b.start();
synchronized (b) {
	try {
		System.out.println(" Waiting for 2 to complete ...");
		b.wait();
	}catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("Total is : "+b.total);
	
}
	}

}
