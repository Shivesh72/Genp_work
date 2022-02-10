package com.org.gen.day4;
interface OnResult{
	void OnSuccess(double a );
	void OnError(Exception e);
}
class Divide implements OnResult{
	OnResult onResult;
	double a, b;
	public Divide(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	void doDiv() {
		if(b==0) {
			onResult.OnError(new Exception("Divide by zero"));
			return;
		}
		onResult.OnSuccess(a/b);
	}
	void setOnResult(OnResult onResult) {
		this.onResult=onResult;
	}
	@Override
	public void OnSuccess(double a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void OnError(Exception e) {
		// TODO Auto-generated method stub
		
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Divide d = new Divide(3, 6);
d.setOnResult(new OnResult() {
	
	@Override
	public void OnSuccess(double a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public void OnError(Exception e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}
});
d.doDiv();
	}

}
