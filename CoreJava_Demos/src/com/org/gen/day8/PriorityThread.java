package com.org.gen.day8;

public class PriorityThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityThread pt = new PriorityThread();
Thread t1 = new Thread(pt, "FirstThread");
Thread t2 = new Thread(pt, "SecondThread");
Thread t3 = new Thread(pt, "ThirdThread");
t1.setPriority(2);t2.setPriority(4);t3.setPriority(8);
t1.start();t2.start();t3.start();
//System.out.println("priority of Thread "+t.getPriority());
//System.out.println(" Name of thread "+t.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

}
