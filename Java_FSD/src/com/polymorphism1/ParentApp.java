package com.polymorphism1;
class Parent{
	int x=10;
	void disp() {
		System.out.println("this is parent");
	}
}
class Child extends Parent{
	int x=20;
	void disp() {
		super.disp();
		System.out.println("this is child");
		
	}
}

public class ParentApp {
	public static void main(String[] args) {
		Child c=new Child();
		c.disp();
	}

}