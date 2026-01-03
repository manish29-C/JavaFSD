package com.interface1;

public class AyushInfoTech implements KodCalci {
	int a;
	int b;
    public AyushInfoTech(int a, int b) {
    	this.a=a;
    	this.b=b;
    }
    
    public void add() {
    	int c=a+b;
    	System.out.println("Addition is "+c);
    }
    
    public void sub() {
    	int c=a-b;
    	System.out.println("sub is "+c);
    }
    public void mul() {
    	int c=a*b;
    	System.out.println("mul is "+c);
    }
    public void div() {
    	int c=a/b;
    	System.out.println(c);
    }

}