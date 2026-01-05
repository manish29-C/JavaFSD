package com.exceptionHand;

import java.util.Scanner;

public class ATM {
       void transaction() throws Exception{
    	   System.out.println("ATM connection estab");
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter value v1");
    	   int a=sc.nextInt();
    	   System.out.println("Enter value 2");
    	   int b=sc.nextInt();
    	   try {
    		   int c=a/b;
    		   System.out.println(c);
    	   }catch(Exception e) {
    		   System.out.println("");
    		   throw e;
    	   }finally {
    	   System.out.println("ATM Connection termination");
    	   }
       }
}
