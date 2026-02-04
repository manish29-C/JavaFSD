package com.collection;

class Student {
	String name;
	int age;
	String gender;
	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

class StudentApp{
	public static void main(String[] args) {
		Student s=new Student("Manish", 21,"Male");
		Student s1=new Student("Ayush", 20,"Male");
		Student s2=new Student("Vansh", 21,"Male");
		
		Student[] st= {s,s1,s2};
		for(Student ss:st) {
			System.out.println(s);
		}
	}
}