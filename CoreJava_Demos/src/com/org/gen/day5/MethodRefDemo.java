package com.org.gen.day5;

/*in general we can provide ref in three ways 
 * static method ref , instance method ref  , constructor ref
 * 
 * in addition we have two more ways 
 * method ref of an arbitrary obj of a given type 
 * Method ref from a super class method 
 * 
 * */

@FunctionalInterface
interface A{//student
	void getName(String name);//query
	
}

public class MethodRefDemo implements A{//genpact

	static void getInfo(String info) {//trainer 
		System.out.println(" This is getInfo method body");
		System.out.println(info);//github
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = (name)->System.out.println(name);
		a.getName(" SAM is executing ");
		
		A a1 = MethodRefDemo::getInfo;//genpact::trainer
		a1.getName("getInfo of class is executing");
		

	}


	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		
	}

}

