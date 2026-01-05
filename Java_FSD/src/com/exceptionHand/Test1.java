package com.exceptionHand;

public class Test1 {
	void alpha()throws Exception {
		System.out.println("Connection 1 estab");
		Test2 t2=new Test2();
		t2.beta();
		System.out.println("Connection 1 termination");
	}

}
