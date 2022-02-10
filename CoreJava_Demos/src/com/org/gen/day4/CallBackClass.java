package com.org.gen.day4;
interface PrintTxt{
	void samplefun(String txt);
}
class ClassA implements PrintTxt{

	@Override
	public void samplefun(String txt) {
		// TODO Auto-generated method stub
		System.out.println(" The text is -> "+txt);
	}
	
}
public class CallBackClass {
	
	//ref of the interface 
	PrintTxt txt1;
	
	public CallBackClass(PrintTxt txt1) {
		super();
		this.txt1 = txt1;
	}
public void SampleFun2(String s ) {
	txt1.samplefun(s);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA objA = new ClassA();
CallBackClass obj2 = new CallBackClass(objA);
obj2.SampleFun2(" Program is about callback Interface");
	}

}
