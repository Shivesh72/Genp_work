package com.org.gen.day4;

public class ObjectClone implements Cloneable {
	int objId;
	String objName;
	

	public ObjectClone(int objId, String objName) {
		super();
		this.objId = objId;
		this.objName = objName;
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
ObjectClone ob1 = new ObjectClone(101, "Object1");
ObjectClone ob2 = (ObjectClone)ob1.clone();

System.out.println(ob1.objId+"   "+ob1.objName);
System.out.println(ob2.objId+"   "+ob2.objName);
	}

}
