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
	
	void verify() throws InvalidInputException{
		 if((accNo==user_acc) && (password==user_pass)){
			 System.out.println("Collect your cash");
		 }else {
			 InvalidInputException e=new InvalidInputException();
			 System.out.println(e.getMessage());
			 throw e;
		 }
	}

}

class InvalidInputException extends Exception{
	public String getMessage() {
		return "Wrong Credentials";
		
	}
}