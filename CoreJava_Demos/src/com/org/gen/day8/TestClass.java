package com.org.gen.day8;

class Customer{
	int d_amount = 10000;
	
	synchronized void withdraw(int d_amount){
		System.out.println("going to withdraw");
		if(this.d_amount<d_amount) {
			System.out.println(" Balance is not available ");
			try {
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
			this.d_amount -= d_amount;
			System.out.println("withdraw completed ..");
		}
	}
	synchronized void deposit(int d_amount) {
		System.out.println("going to deposit");
		this.d_amount+=d_amount;
		System.out.println("deposit complete ");
		notify();
	}
}


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Customer c = new Customer();
 new Thread() {
	 public void run() {
		 c.withdraw(20000);}
	 }.start();
	 new Thread() {
		 public void run() {
			 c.deposit(10000);} 
 }.start();
	}

}
