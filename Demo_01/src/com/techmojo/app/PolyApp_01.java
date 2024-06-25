package com.techmojo.app;

import com.techmojo.beans.Polygon;
import com.techmojo.beans.Rectangle;
import com.techmojo.beans.Triangle;

public class PolyApp_01 {

	public static void main(String[] args) {
		Polygon p;
		
		p= new Triangle(4.3, 5.4);
		System.out.println("Area Triangle: " + p.getArea());
		p= new Rectangle(5.4, 6.5);
		System.out.println("Area Rectangle: " + p.getArea());
	}

}
