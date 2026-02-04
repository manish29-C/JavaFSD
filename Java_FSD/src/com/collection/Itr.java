package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Itr {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(175);
		al.add(125);
		Iterator  itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add(60);
		}
		
	}

}
