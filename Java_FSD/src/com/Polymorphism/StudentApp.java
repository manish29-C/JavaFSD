package com.Polymorphism;

class Student{
	Heart h=new Heart("Pumping",50f);
	Brain b=new Brain(13,"Provide Singal");
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getColor());
		System.out.println(b.getPrice());
	}
	 
	void hasAA(Book c) {
		System.out.println(c.getPages());
		System.out.println(c.getTopic());
	}
	
}
class Bike{
	String brand;
	int price;
	String color;
	public Bike(String brand, int price, String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
}
class Heart{
	String job;
	float weight;
	public Heart(String job, float weight) {
		this.job=job;
		this.weight=weight;
	}
	public String getJob() {
		return job;
	}
	
	public float getWeight() {
		return weight;
	}
	
}
class Brain{
	int weight;
	String job;
	public Brain(int weight, String job) {
		
		this.weight = weight;
		this.job = job;
	}
	public int getWeight() {
		return weight;
	}
	
	public String getJob() {
		return job;
	}
}

class Book{
	int pages;
	String name;
	public Book(int pages, String topic) {
		this.pages = pages;
		this.name = topic;
	}
	public int getPages() {
		return pages;
	}
	public String getTopic() {
		return name;
	}
	
}
public class StudentApp {
	
	public static void main(String[] args) {
		Student s=new Student();
		//s=null;
	    
		Bike bb=new Bike("GT650",4500000, "silver");
		Book book=new Book(250,"Java ");
		s.hasA(bb);
		s.hasAA(book);
//		System.out.println(bb.getBrand());
//		System.out.println(bb.getColor());
//		System.out.println(bb.getPrice());
		
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		
		System.out.println(s.b.getJob());
		System.out.println(s.b.getWeight());
		
		
	}
}