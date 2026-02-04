package com.collection;

import java.util.*;
import java.util.LinkedList;

public class IteratorInJava {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(50);
		a.add(150);
		a.add(25);
		a.add(75);
		a.add(125);
		a.add(175);
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			//Object object = (Object) iterator.next();
			System.out.println(iterator.next());
			
		}
		System.out.println();
		
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		ListIterator litr=a.listIterator(a.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(25);
		
		
		
	}

}
