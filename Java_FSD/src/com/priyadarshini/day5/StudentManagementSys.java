package com.priyadarshini.day5;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int id; String name; double marks;
	
	Student(int id, String name, double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	void display() {
		System.out.println("Name of Student : "+name);
		System.out.println("Id of Student : "+id);
		System.out.println("Marks of student : "+marks);
	}
}

public class StudentManagementSys {
	public static void main(String[] args) {
		
		List<Student> s=new ArrayList<>();
		
		s.add(new Student(148,"manish",78.5));
		s.add(new Student(149,"kartik",74.5));
		s.add(new Student(178,"Ayush",71.5));
		
		for(Student student:s) {
			student.display();
		}
		
	}

}