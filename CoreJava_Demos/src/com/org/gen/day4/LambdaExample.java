package com.org.gen.day4;

@FunctionalInterface
interface GenericInterface<T>{
	T func(T t);//String func(String g)--int func(int i)
}
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   GenericInterface<String> r = (s1)->{
	   String result = "";
	   for(int i = s1.length()-1;i>=0;i--)
		   result+= s1.charAt(i);
	   return result;
   
	};
	System.out.println(" Lambda ->"+ r.func("Java"));
	
GenericInterface<Integer> cal = (n)->{
	int result = 1;
	for(int i = 1 ;i<=n;i++)
		result = i*result;
	return result;
};
System.out.println(" result = "+cal.func(5));
}
}