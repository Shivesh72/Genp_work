package com.org.gen.day8;

public class DeadLock_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String rs1 = " Thread1";
String rs2 = " Thread2";

Thread t1 = new Thread() {
	public void run() {
		synchronized (rs1) {
			System.out.println(" Thread 1 : locked resource 1");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (rs2) {
				System.out.println("Thread 1 : locked of rs 2 ");
			}	
		}
	}
};
Thread t2 = new Thread() {
	public void run() {
		synchronized (rs2) {
			System.out.println(" Thread 2 : locked resource 2");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (rs1) {
				System.out.println("Thread 2 : locked of rs 1 ");
			}
		}
		
	}
	
};
t1.start();
t2.start();
	}

}
