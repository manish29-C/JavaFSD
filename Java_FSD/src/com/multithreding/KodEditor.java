package com.multithreding;

public class KodEditor {
	public static void main(String[] args) {
		Typing t1=new Typing();
		SpellCheck t2=new SpellCheck();
		Saving t3=new Saving();
		
		t1.start();
		t2.start();
		t3.start();
	}
}



