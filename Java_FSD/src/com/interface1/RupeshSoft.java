package com.interface1;

public class RupeshSoft implements KodCalci {

	@Override
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
		int a=30;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}

	@Override
	public void mul() {
		int a=5;
		int b=9;
		int c=a*b;
		System.out.println(c);
	}

	@Override
	public void div() {
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}

}