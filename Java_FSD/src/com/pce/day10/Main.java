package com.pce.day10;

class Student{
	private String name;
	private int age;
	private String gender;
	
	
	public Student(String name,int age, String gender ) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Student s=new Student("manish", 21, "Male");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
		
		
	}

}