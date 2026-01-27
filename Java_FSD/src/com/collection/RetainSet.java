package com.collection;

import java.util.ArrayList;

public class RetainSet {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(20);
		al.add(100);
		al.add(150);
		al.add(200);
		al.add(10);
		al.add(40);
		System.out.println("List-1=>"+al);
		
		ArrayList al1 = new ArrayList();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);

		System.out.println("List-2=>"+al1);
		al1.set(2, 400);
		System.out.println("Set method used: ");
		System.out.println("List-2 => "+al1);
		
		System.out.println("RetailAll method used: ");
		al.retainAll(al1);
		System.out.println("List-1 => "+al);
		
	}
}
