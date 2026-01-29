package com.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
//		LinkedList ll=new LinkedList();
//		ll.add(100);
//		ll.add(25);
//		ll.add(99);
//		ll.addLast(75);
//		ll.addFirst(50);
//		ll.add(150);
//		System.out.println(ll);
//		System.out.println(ll.get(3));
//		
//		LinkedList lll=new LinkedList();
//		lll.push(10);
//		lll.push(20);
//		lll.push(30);
//		System.out.println(lll);
//		lll.pop();
//		System.out.println(lll);
//		
//		
//		System.out.println(lll.peek());
//		System.out.println(lll.peekFirst());
//		System.out.println(lll.peekLast());
//		System.out.println(lll);
		
		
		ArrayDeque ad=new ArrayDeque();
		long t1=System.currentTimeMillis();
		for(int i=0;i<100000000;i++) {
			ad.push(i);
		}
		long t2=System.currentTimeMillis();
		
		LinkedList llll=new LinkedList();
		long t3=System.currentTimeMillis();
		for(int i=0;i<100000000;i++) {
			llll.push(i);
		}
		long t4=System.currentTimeMillis();
		System.out.println(t2-t1);
		System.out.println(t4-t3);
		
		
	}

}
