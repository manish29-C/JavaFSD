package com.pce.day11;

class AreaTri{
	double base;
	double height;
	static double half=0.5;
	AreaTri(double base, double height){
		this.base=base;
		this.height=height;
	}
	
	double area1;
	void disp() {
		area1=half*base*height;
		System.out.println("Area of triangle is : "+area1);
	}
}

public class TriangleApp {
	public static void main(String[] args) {
		AreaTri at=new AreaTri(4.5,7);
		at.disp();
		
	}

}