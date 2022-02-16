package com.org.gen.day8;

public class YieldDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
YieldDemo y = new YieldDemo();
Thread t1 = new Thread(y, "First Child Thread");

YieldDemo y1 = new YieldDemo();
Thread t2 = new Thread(y1, "Second Child Thread");

t1.setPriority(4);
t2.setPriority(8);

t1.start();t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current thread "+Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
		
	}

}
