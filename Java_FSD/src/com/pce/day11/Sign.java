package com.pce.day11;

public class Sign {
	public static  void main(String ... args) {
		System.out.println("hello");
		int arr[]= {1,1,4};
		
		Sign.main(arr);
		Sign.main();
	}
	
	public static void main(int[] args) {
		System.out.println("Main accepting integer type array");
	}
	public static void main() {
		System.out.println("main accepting any argument");
	}

}