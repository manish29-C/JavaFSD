package com.collections1;

import java.util.ArrayList;
import java.util.Collections;

public class PassengerApp {
	public static void main(String[] args) {
		PassengerDetail pd=new PassengerDetail(101,"Manish","Nagpur","Gondia");
		PassengerDetail pd1=new PassengerDetail(102,"Harsh","Gondia","Nagpur");
		PassengerDetail pd2=new PassengerDetail(103,"Ayush","Nagpur","Pune");
		PassengerDetail pd3=new PassengerDetail(104,"Kartik","Pune","Gondia");
		PassengerDetail pd4=new PassengerDetail(105,"Ayyain","Nagpur","Mumbai");
		
		ArrayList<PassengerDetail> al=new ArrayList<PassengerDetail>();
		al.add(pd1);
		al.add(pd);
		al.add(pd2);
		al.add(pd4);
		al.add(pd3);
		System.out.println("Sort by using id with  Comparable");
		
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("Sort by using Passe_Name with Comparator");
		
		
		SortingByComparator sb=new SortingByComparator();
		Collections.sort(al, sb);
		System.out.println(al);
		
		
	}

}
