package com.interface1;

import java.util.Scanner;

public class KodCalciApp {
      public static void main(String[] args) {
		
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter a and b ");
    	  int a=sc.nextInt();
    	  int b=sc.nextInt();
    	  disp2(new RupeshSoft());
    	  System.out.println();
    	  disp2(new AyushInfoTech(a,b));
    	  System.out.println();
    	  
    	  System.out.println("Enter Operator");
    	  char operator=sc.next().charAt(0);
    	  disp(new AyushInfoTech(a,b),operator);
    	  
    	  
    	  
	}
      
      static void disp2(KodCalci c) {
    	  c.add();
    	  c.sub();
    	  c.mul();
    	  c.div();
      }
      
      static void disp(KodCalci c, char cc) {
    	  switch(cc) {
    	  case '+':
    		  c.add();
    		  break;
    	  case '-':
    		  c.sub();
    		  break;
    	  case '*':
    		  c.mul();
    		  break;
    	  case '/':
    		  c.div();
    		  break;
    	   default:
    		   System.out.println("Invalid");
    	  }
      }
}