package com.collection;

public class StudentApp1 {
	public static void main(String[] args) {
		Student1 s1=new Student1("Manish",21,"Male","7820885859");
		Student1 s2=new Student1("kartik",21,"Male","7820885859");
		Student1 s3=new Student1("harsh",21,"Male","7820885859");
		Student1 s4=new Student1("ayush",21,"Male","7820885859");
		Student1 []s= {s1,s2,s3,s4};
		for(Student1 ss:s) {
			System.out.println(ss);
		}
		
		System.out.println();
		System.out.println(s1.toString());

	}
	
}
