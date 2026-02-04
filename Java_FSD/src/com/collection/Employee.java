package com.collection;

import java.util.Comparator;

public class Employee  {
	String emp_Name;
	double salary;
	int id;
	public Employee(String emp_name, double salary, int id) {
		super();
		this.emp_Name = emp_name;
		this.salary = salary;
		
		this.id = id;
	}
	public String getEmp_name() {
		return emp_Name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	
	public String toString() {
		return id+" "+emp_Name+" "+salary;
	}
	
	
	// sort by using name //
//	@Override
//	public int compareTo(Object o) {
//		int res=(this.emp_Name).compareTo((((Employee)(o)).emp_Name));
//		if(res>0) {
//			return 1;
//		}else {
//			return -1;
//		}
//		
//	}
	
	
	
	// sort by using salary and id *//
//	public int compareTo(Object o) {
//		if(this.salary > (((Employee)(o)).salary)){
//			return 1;
//		}else {
//			return -1;
//		}
//		
//	}
		
}


class SortComplexObject implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		int res=(((Employee)(o1)).emp_Name).compareTo((((Employee)(o2)).emp_Name));
		if(res>0) {
			return 1;
		}else {
			return -1;
		}
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		if(((Employee)(o1)).id>((Employee)(o2)).id) {
//			return 1;
//		}else {
//			return -1;
//		}
//		
//	}
	
}
