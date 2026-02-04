package com.collection;

// toString method 
public class Student1 {
	String name;
	int age;
	String gender;
	String contact_No;
	public Student1(String name, int age, String gender, String contact_No) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact_No = contact_No;
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
	public String getContact_No() {
		return contact_No;
	}
	public String toString() {
		return name+" "+age+" "+gender+" "+contact_No;
	}


}
