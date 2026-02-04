package com.collection;

public class SApp {
	public static void main(String[] args) {
		Student s=new Student("Manish", 21,"Male");
		Student s1=new Student("Ayush", 20,"Male");
		Student s2=new Student("Vansh", 21,"Male");
		
		Student[] st= {s,s1,s2};
		for(Student ss:st) {
			System.out.println(ss.getName());
			System.out.println(ss.getAge());
			System.out.println(ss.getGender());
			System.out.println();
		}
	}
}