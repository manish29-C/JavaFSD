package com.exceptionHand;

public class TestApp {
	public static void main(String[] args) {
		Test1 t1=new Test1();
		System.out.println("Main Connection estab");
		try {
		t1.alpha();
		}catch(Exception c) {
			System.out.println("Exception handled by main");
		}
		System.out.println("Main Connection termination ");
	}

}
