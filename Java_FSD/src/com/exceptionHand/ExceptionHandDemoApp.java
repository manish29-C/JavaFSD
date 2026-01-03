package com.exceptionHand;

import java.util.Scanner;

public class ExceptionHandDemoApp {
	public static void main(String[] args) {
		System.out.println("Connection Established");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value 1");
		int a=sc.nextInt();
		
		System.out.println("Please enter value to divide");
		int b=sc.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception handle");
			
		}
		System.out.println("Connection terminated");
		sc.close();
	} 
}
