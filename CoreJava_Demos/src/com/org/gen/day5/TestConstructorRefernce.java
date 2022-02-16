package com.org.gen.day5;
interface C{
	public Employee getEmployee();
}

interface D{
	public Employee getEmployee(String name , int age);
}
class Employee{
	String eName; int Age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String eName, int age) {
		super();
		this.eName = eName;
		this.Age = age;
	}
	public void getInfo() {
		System.out.println("I am method of class Employee");
	}
}
public class TestConstructorRefernce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda Expression 
		C c1 = ()->new Employee();
		c1.getEmployee().getInfo();
		
		D d1 = (ename , age)->new Employee(ename , age);
		d1.getEmployee("Yash", 22).getInfo();
		
		
		// method ref 
		C c2 = Employee::new; //constructor will use new keyword with class name 
		c2.getEmployee().getInfo();
		D d2 = Employee::new;
		d2.getEmployee("Raj", 23).getInfo();
		

	}

}
