package com.pce.day10;
class Area{
	double pi=3.14;
	double r;
	static double area;
	
	public Area(double r) {
		this.r=r;
	}
	
	void disp() {
		area=pi*r*r;
		System.out.println("Area of circle is : "+area);
	}
}

public class AreaCal {
	public static void main(String[] args) {
		Area a=new Area(4.5);
		a.disp();
	}

}