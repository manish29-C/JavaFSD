package com.Polymorphism;

class Tendulkar{
	void job() {
		System.out.println("Play Cricket");
	}
	
	void profession() {
		System.out.println("Batting");
	}
}
class ArunTendulkar extends Tendulkar{
	void profession() {
		System.out.println("Boller");
	}
	void smoke() {
		System.out.println("smoke");
	}
}

public class TendulkarApp {
	public static void main(String[] args) {
		Tendulkar t=new ArunTendulkar();
//		t.job();
//		t.profession();
//		t.smoke();   // because of parent type refrence only override method is call not specilized method . 
		
		t.job();
     	t.profession();
		((ArunTendulkar)t).smoke();
	}

}