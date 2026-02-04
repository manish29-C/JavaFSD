package com.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentItr {
	public static void main(String[] args) {
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(175);
		al.add(125);
		Iterator  itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
			al.add(500);
			
		}
		//System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}

}
