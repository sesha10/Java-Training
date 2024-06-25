package com.techmojo.beans;

public abstract class Polygon {
	double x;
	double y;
	
	public Polygon(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	abstract public double getArea();
}
