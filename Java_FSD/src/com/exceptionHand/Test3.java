package com.exceptionHand;

import java.util.Scanner;

public class Test3 {
	void gama()throws Exception {
		System.out.println("Connection 3 esta");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1");
		int a=sc.nextInt();
		System.out.println("Enter value 2");
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println(c);
		
		System.out.println("Connection 3 termination");
	}

}
