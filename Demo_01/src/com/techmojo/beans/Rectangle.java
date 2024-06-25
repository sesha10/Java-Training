package com.techmojo.beans;

public class Rectangle extends Polygon {
	public Rectangle(double height, double width) {
		super(height, width);
		// TODO Auto-generated constructor stub
 
	}
	
	public double getArea() {
		double area;
		area = x * y;
		return area;
	}
}
