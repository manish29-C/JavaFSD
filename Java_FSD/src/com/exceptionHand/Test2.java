package com.exceptionHand;

public class Test2 {
	void beta()throws Exception {
		System.out.println("Connection 2 estab");
		Test3 t3=new Test3();
		
		t3.gama();
		
		System.out.println("Connection 2 termination");
	}
}
