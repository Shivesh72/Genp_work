package com.org.gen.day8;

public class SleepCurrentThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Hello Thread ");
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Java");
		System.out.println(Thread.currentThread());
	}
	public void m1() {
		System.out.println("m1 method ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SleepCurrentThread sp = new SleepCurrentThread();
 Thread t = new Thread(sp,"Child Thread");
 t.start();
 System.out.println(" Number of active thread : "+Thread.activeCount());
 sp.m1();
	}

	

}
