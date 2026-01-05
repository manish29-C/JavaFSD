package com.exceptionHand;

public class Bank {
       void banking() {
    	   System.out.println("Bank connection estab");
    	   ATM at=new ATM();
    	   try {
    		   at.transaction();
    	   }catch(Exception e) {
    		   System.out.println("Info recive from bank your amount will refunded within 24 hours");
    	   }
    	   System.out.println("Bank connection termination");
       }

}
