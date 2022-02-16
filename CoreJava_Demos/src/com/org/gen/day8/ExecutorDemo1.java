package com.org.gen.day8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Addition implements Runnable
{
 int a;
 int b;
 public Addition(int a, int b){
  this.a = a;
  this.b = b;
 }
@Override
public void run()
{
  int sum = a + b;
  System.out.println("Sum: " +sum);
 }
}
class Subtraction implements Runnable
{
 int x;
 int y;
public Subtraction(int x, int y){
  this.x = x;
  this.y = y;
 }
@Override
public void run()
{
 int sub = x - y;
System.out.println("Sub: " +sub);
 }
}
class Multiplication implements Runnable
{
 int p;

public Multiplication(int p){
	  this.p = p;
 }
@Override
public void run()
{
 int multiply = p * p;
 System.out.println("Multiply: " +multiply);
  }
}
public class ExecutorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExecutorService exe = Executors.newFixedThreadPool(1);
exe.execute(new Addition(2, 3));
exe.execute(new Subtraction(10, 4));
exe.execute(new Multiplication(5));

exe.shutdown();
	}

}
