package com.org.gen.day8;

public class ThreadDemo extends Thread{
	
	String task;
	public ThreadDemo(String task) {
		super();
		this.task = task;
	}
public void run() {//running
	for(int i = 1 ; i<=5 ; i++) {
		System.out.println(task +" : "+i);
try{
	Thread.sleep(1000);
}catch(Exception e ){
	System.out.println();
}
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two object to represent the two tasks
 ThreadDemo th1 = new ThreadDemo(" cut the ticket");//new born 
 ThreadDemo th2 = new ThreadDemo("show your seat number ");
 //two objects of thread class and pass two obj as parameter to construtor of thread class 
 Thread t1 = new Thread(th1);
 Thread t2 = new Thread(th2);
 
 t1.start();//runnable
 t2.start();
	}

}
