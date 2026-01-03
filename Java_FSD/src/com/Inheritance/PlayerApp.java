package com.Inheritance;

class Player{
	String name;
	int age;
	String gender;
}

class FootBall extends Player{
	int goals;
	int assist;
	 FootBall(String name, int age, String gender, int goals, int assist){
		 this.name=name;
		 this.age=age;
		 this.gender=gender;
		 this.goals=goals;
		 this.assist=assist;
	 }
	 public int getGoals() {
		 return goals;
	 }
	 
	 public int getAssist() {
		 return assist;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public String getGender() {
		 return gender;
	 }
	 
}

class Cricket extends Player{
	int centuries;
	double strikRate;
	int runs;
	int wickets;
	public Cricket(String name, int age, String gender,int centuries, double strikRate, int runs, int wickets) {
		super();
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.centuries = centuries;
		this.strikRate = strikRate;
		this.runs = runs;
		this.wickets = wickets;
	}
	public int getCenturies() {
		return centuries;
	}
	
	public double getStrikRate() {
		return strikRate;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public int getWickets() {
		return wickets;
	}
	public String getName() {
		 return name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public String getGender() {
		 return gender;
	 }
	
	
}

public class PlayerApp {

	public static void main(String[] args) {
		FootBall fb=new FootBall("Manish", 21, "Male",4,5);
		System.out.println(fb.getName());
		System.out.println(fb.getAge());
		System.out.println(fb.getAssist());
		System.out.println(fb.getGender());
		System.out.println(fb.getGoals());
		System.out.println("==============================");
		
		
		Cricket c=new Cricket("Manish",21,"Male",45,80.82,14075,76);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getGender());
		System.out.println(c.getCenturies());
		System.out.println(c.getStrikRate());
		System.out.println(c.getRuns());
		System.out.println(c.getWickets());
	}

}