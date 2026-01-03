package com.Polymorphism;


class SecurityForce{
	public void job() {
		System.out.println("Protect the nation");
	}
	
	public void protect() {
		System.out.println("security forrce to protecting the land");
	}
}

class Army extends SecurityForce{
	public void protect() {
		System.out.println("Secure the land and borders");
	}
}

class Navy extends SecurityForce{
	public void protect() {
		System.out.println("secure the Occean And water Border");
	}
}

class AirForce extends SecurityForce{
	public void protect(){
		System.out.println("secure the air And Air-border");
	}
}

public class SecurityApp {
	public static void main(String[] args) {
		duty(new Army());
		duty(new Navy());
		duty(new AirForce());
		
	}
	
	static void duty(SecurityForce s) {
		s.job();
		s.protect();
	}
}