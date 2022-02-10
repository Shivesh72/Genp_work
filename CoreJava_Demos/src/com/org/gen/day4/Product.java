package com.org.gen.day4;

public class Product implements Cloneable {
private String pname ;
private  String ptype;

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getPtype() {
	return ptype;
}

public void setPtype(String ptype) {
	this.ptype = ptype;
}



@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Product pro = (Product) super.clone();
	return super.clone();
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Product[pname="+pname+",ptype="+ptype+"]";
}

public static void main(String args[]) {
	Product pro = new Product();
	
	pro.setPname("Laptop");
	pro.setPtype("Digital");
	
	System.out.println(pro.toString());
	
	
	
	
	
	
	
	
	
	
}
}
