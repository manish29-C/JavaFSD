package com.multithreading2;

public class WashRoomApp {                                         
	public static void main(String[] args) throws InterruptedException {
		WashRoom w=new WashRoom();
		Thread t1=new Thread(w);
		Thread t2=new Thread(w);
		Thread t3=new Thread(w);
		
		t1.setName("Thor");
		t2.setName("Loki");
		t3.setName("Hulk");
		
		t1.start();
		t2.start();
		t3.start();

	}
}
