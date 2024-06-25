package com.techmojo.beans;

public class Triangle extends Polygon {

	public Triangle(double base, double height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		double area;
		area = 0.5 * x * y;
		return area;
	}
}
