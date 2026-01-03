package com.priyadarshini.day5;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> email=new HashSet<>();
		
		email.add("manishchaudhari29042gmail.com");
		email.add("mac891042@gmail.com");
		email.add("mchaudhari@gmail.com");
		email.add("mchaudhari@gmail.com");
		email.add("mchaudhari@gmail.com");
		
		System.out.println("Registred email: ");
		for(String s:email) {
			System.out.println(s);
		}
		
	}

}