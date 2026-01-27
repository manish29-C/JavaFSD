package com.multithreading2;

public class WashRoom implements Runnable {

	@Override
	 synchronized  public void run() {
		try {
	     String tName=Thread.currentThread().getName();
	     System.out.println(tName+" is enter in washroom");
	     
			Thread.sleep(3000);
	        System.out.println(tName+" is using the washroom");
	        Thread.sleep(3000);
	        System.out.println(tName+" is exiting the washroom");
	        Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
