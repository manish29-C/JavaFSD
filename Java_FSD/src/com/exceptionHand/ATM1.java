package com.exceptionHand;

import java.util.Scanner;

public class ATM1 {
	int accNo=254;
	int password=2904;
	int user_acc;
	int user_pass;
	
	
	void acceptInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no. and password");
		user_acc=sc.nextInt();
		user_pass=sc.nextInt();
	}
	
	void verify() {
		 if((accNo==user_acc) && (password==user_pass)){
			 System.out.println("Login successful");
		 }else {
			 System.out.println("Login failed");
		 }
	}

}
