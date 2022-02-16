package com.org.gen.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> stu = new ArrayList<>();
stu.add(new Student(123, "Amit", 300, 12));
stu.add(new Student(124, "sumit", 500, 15));
stu.add(new Student(120, "Arti", 100, 10));
stu.add(new Student(111, "ziya", 120, 13));
stu.add(new Student(101, "pavan", 800, 19));
System.out.println(" Arrange data according to marks ");

Collections.sort(stu , new MarksCompare());
Iterator< Student> it = stu.iterator();
while(it.hasNext()) {
	Student st = it.next();
	System.out.println(st.rollno+"   "+st.name+"    "+st.age+"    "+st.marks);
}

	}

}
