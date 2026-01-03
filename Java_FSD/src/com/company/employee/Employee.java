package com.company.employee;

public class Employee {
	
	public int empId=148;
    protected double salary=45000;
    String departmentName="IT";
    private String password="Manish@4845";
    
     public void showEmployeeDetail()
    {	
    	System.out.println("Employee Id : "+empId);
		System.out.println("Employee Salary "+salary);
		System.out.println("Employee Department Name : "+departmentName);
		System.out.println("Employee password : "+password);
    }
	

}
