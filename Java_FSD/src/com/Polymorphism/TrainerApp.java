package com.Polymorphism;

class Trainer{
	void teacher() {
		System.out.println("Teach something");
	}
}

class JavaTrainer extends Trainer{
	void teacher() {
		System.out.println("Teach java ");
	}
}

class AptiTrainer extends Trainer{
	void teacher() {
		System.out.println("tech Apti");
	}
}
class TestingTrainer extends Trainer{
	void teacher() {
		System.out.println("tech testing");
	}
}

public class TrainerApp {
	public static void main(String[] args) {	
		
		
		JavaTrainer j=new JavaTrainer();
		j.teacher();
		
		AptiTrainer a=new AptiTrainer();
		a.teacher();
		
		TestingTrainer t=new TestingTrainer();
		t.teacher();//tight coupling.   Polymorphism not achieve.
		
		System.out.println("---------------------------------------------");
		
		Trainer tt;
		 tt=new JavaTrainer();
		tt.teacher();
		
		tt=new AptiTrainer();
		tt.teacher();
		
		tt=new TestingTrainer();
		tt.teacher();   //loose coupling.  Polymorphism achieve but not code reduction .
		System.out.println("---------------------------------------------");
		
		
		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestingTrainer());  // Polymorphism with code reduction.
		
		
	}
	
	static void duty(Trainer t) {
		t.teacher();
	}

}