package com.pce.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Student{
	int id; String name; double marks;
	
	Student(int id, String name,double marks ){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}

public class StudentRecordManagement {

	public static void main(String[] args) throws IOException  {
		File f1 = new File("student.txt");
		BufferedWriter b1 = new BufferedWriter(new FileWriter(f1,true))	;
//		Student s1 = new Student();
		
		b1.newLine();
		b1.write("101 abc 34000");
		b1.newLine();
		b1.write("102 xyz 45000");
		b1.close();
		System.out.println("Record inserted successfully");
		
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();

	}

}