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
		
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("please enter index no. arr");
		int n=sc.nextInt();
		arr[n]=999;
		
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please define the index no. within  a range ");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("please enter positive no.");
		}
		catch(Exception e) {
			System.out.println("Divide by zero not allowed");
		}
		System.out.println("Connection terminated");
		sc.close();
	} 
}
