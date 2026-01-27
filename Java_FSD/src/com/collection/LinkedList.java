package com.collection;

import java.util.ArrayList;

public class LinkedList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(20);
		al.add(100);
		al.add(150);
		al.add(200);
		al.add(10);
		al.add(40);
		System.out.println("List-1=>"+al);
		
		ArrayList arr1=new ArrayList();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		
		System.out.println("List-2 =>"+arr1);
		
		al.addAll(arr1);
		System.out.println("Full List =>"+al);
		
		
		System.out.print("Checking list: ");
		
		System.out.println(al.containsAll(arr1));
		
		System.out.println("Removing Data:"+al.remove(0));
		System.out.println(al);
		
		al.removeAll(arr1);
		System.out.println("Removing arr1 Data:"+al);
		
	}
}
