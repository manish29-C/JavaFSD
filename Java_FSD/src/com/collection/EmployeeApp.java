package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("David",210,102);
		Employee e2 = new Employee("Arsh",200,101);
		Employee e3 = new Employee ("Daniel",150,103);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		//Collections.sort(al);
		SortComplexObject st=new SortComplexObject();
		Collections.sort(al, st);
		
		System.out.println(al);
		
		
		//compareTo()
//		String s="SACHIN";
//		String s1="SAURAV";
//		
//		System.out.println("------------------");
//		int res=s.compareTo(s1);
//		System.out.println(res);

	}

}

