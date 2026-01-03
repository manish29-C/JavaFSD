package com.pce.day10;

class Employee{
	int emp_id;
	String name;
	int salary;
	
	public Employee(int emp_id, String name, int salary) {
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
	}
	public Employee() {
		this(101, "Manish", 450000);
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
}

public class Emp {
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.getEmp_id());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}