package com.polymorphism1;

class Human{
	Brain b=new Brain("Provide singal",12);
	Heart h=new Heart(3,"Pumping");
}
class Brain{
	String job;
	int weight;
	public Brain(String job, int weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public int getWeight() {
		return weight;
	}
}
class Heart{
	int weight;
	String job;
	public Heart(int weight, String job) {
		super();
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
class Student extends Human{
	void hasA(Book b) {
		System.out.println(b.getPages());
		System.out.println(b.getName());
	}
	void hasAA(Bike bike) {
		System.out.println(bike.getBrand());
		System.out.println(bike.getColor());
		System.out.println(bike.getPrice());
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
	public String getName() {
		return name;
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
public class StudentApp {
	public static void main(String[] args) {
		Student s=new Student();
		Book book=new Book(350,"java Book");
		Bike bike=new Bike("GT",350000,"black");
		s.hasA(book);
		System.out.println();
		s.hasAA(bike);
		System.out.println();
		
		System.out.println(s.b.getJob());
		System.out.println(s.b.getWeight());
		
		System.out.println();
		
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
	}
}