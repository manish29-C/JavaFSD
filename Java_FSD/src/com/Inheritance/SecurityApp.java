package com.Inheritance;

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
	
	void useTank() {
		System.out.println("Use tank");
	}
}

class Navy extends SecurityForce{
	public void protect() {
		System.out.println("secure the Occean And water Border");
	}
	
	public void useShip() {
		System.out.println("use vikrant INS ship");
	}
}

class AirForce extends SecurityForce{
	public void protect(){
		System.out.println("secure the air And Air-border");
	}
	public void useJets() {
		System.out.println("use jets");
	}
}

public class SecurityApp {
	public static void main(String[] args) {
		Army a=new Army();
		a.job();
		a.protect();
		a.useTank();
		System.out.println("===========================");
		
		Navy n=new Navy();
		n.job();
		n.protect();
		n.useShip();
		System.out.println("===========================");
		
		AirForce ar=new AirForce();
		ar.job();
		ar.protect();
		ar.useJets();
		
	}
}