package com.Polymorphism;

class Parent{
	 Animal disp(){
		  Animal a=new Animal();
		  return a;
	  }
	
}
class childd extends Parent{
	Dog disp(){
		Dog d=new Dog();
		return d;
	}
}
class Animal{
	void sound() {
        System.out.println("sound");
	}
}
class Dog extends Animal{
	
}

public class OverridenApp {
	public static void main(String[] args) {
		childd c=new childd();
		System.out.println(c);
	}

}