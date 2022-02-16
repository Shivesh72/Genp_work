package com.org.gen.day8;

class Data{
	synchronized void printTable(int n) {
		for(int i=0 ; i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(600);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Thread1 extends Thread{
Data d;
		
public Thread1(Data d) {
	super();
	this.d = d;
}

public void run() {
	d.printTable(2);
}	
}
class Thread2 extends Thread{
	Data d ;

	public Thread2(Data d) {
		super();
		this.d = d;
	}
	public void run() {
		d.printTable(5);
	}
}

public class SynchronizedDemo  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Data d1 = new Data();
       Thread1 t1 = new Thread1(d1);
       Thread2 t2 = new Thread2(d1);
       t1.start();t2.start();
	}

}
