package com.methodOverridding;
class Parent1{
	static void disp() {
		System.out.println("this is parent");
	}
}
class Child1 extends Parent1{
	static void disp() {
		System.out.println("this is child");
	}
}

public class MethodHiddingApp {
       public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.disp();
		
		Child1 c=new Child1();
		c.disp();
		
		Parent1 p1=new Parent1();
		p1.disp();
	}
}
