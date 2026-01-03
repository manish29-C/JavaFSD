package com.Inheritance;
class Parent2{
	private int a=10;
	int b=20;
	private void disp() {
		System.out.println(a);
		System.out.println(b); 
	}
}

class Child1 extends Parent2{
	
}

public class RuleNo2 {

	public static void main(String[] args) {
    Child1 c=new Child1();
		
		//System.out.println(c.a);
		System.out.println("================");
		//c.disp(); // private member not allow in inheritance

	}

}