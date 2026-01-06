package com.multithreding;

public class CodeEditor {
	public static void main(String[] args) {
		Working(new Typing());
		Working(new SpellCheck());
		Working(new Saving());
	}
	
	static void Working(Thread t) {
		t.start();
	}
}

class SpellCheck extends Thread{
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Checking Spell...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Saving extends Thread{
public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Saving...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Typing extends Thread{
public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

