package com.org.gen.day8;

public class YieldDemo2 extends Thread{

	public void run() {
		for(int i = 0 ;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+" in control");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
YieldDemo2 yd = new YieldDemo2();
YieldDemo2 yd1 = new YieldDemo2();
yd.start();yd1.start();

for(int i=0;i<3;i++) {
	yd.yield();
	System.out.println(Thread.currentThread().getName()+"  in control inside main");
}
	}

}
