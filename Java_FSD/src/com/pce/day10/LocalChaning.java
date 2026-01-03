
package com.pce.day10;
class Employee1{
	int emp_id;
	String name;
	int salary;
	
	public Employee1() {
		this(101,"Manish",7800);
		System.out.println("0 parameter called");
	}
	
	public Employee1(int emp_id) {
	     System.out.println("1 parameter called");
	}
	public Employee1(int emp_id, String name) {
		this(101);
		System.out.println("2 parameter called");
	}
	public Employee1(int emp_id, String name, int salary) {
		this(101,"Manish");
		System.out.println("3 parameter called");
	}
}

public class LocalChaning {
	
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		
	}

}
