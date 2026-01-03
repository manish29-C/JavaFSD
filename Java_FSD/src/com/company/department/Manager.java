package com.company.department;

import com.company.employee.*;

public class Manager extends Employee {
	public void accessEmployeeData() {
		
		System.out.println("id : "+empId);
		System.out.println("salary : "+salary);
		showEmployeeDetail();
	
	}
	
	public static void main(String[] args) {
		
		Manager m=new Manager();
		
		m.accessEmployeeData();
		
	}
	

}