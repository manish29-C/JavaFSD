package com.collection;

import java.util.TreeSet;

public class TreeSetApp {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		
		System.out.println("-----------------");
		
		System.out.println(ts.ceiling(71));
		System.out.println(ts.floor(25));
		System.out.println(ts.lower(75));
		System.out.println(ts.higher(75));
		
	}

}
