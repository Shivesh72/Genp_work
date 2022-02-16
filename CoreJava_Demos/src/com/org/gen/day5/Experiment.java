package com.org.gen.day5;

@FunctionalInterface
interface funInterface{
	void disp();
	static void print() {
		System.out.println(" Static method ");
	}
}

public class Experiment implements funInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Experiment ee = new Experiment();
ee.disp();
funInterface.print();
Experiment.print();
	}
	static void print() {
		System.out.println(" Experiment  static method ");
	}
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(" Abstract method ");
	}
	

}
