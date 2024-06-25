package com.techmojo.beans;

public class CarFactory {
	public static Car getVehicle() {
		Car vehicle = new Slavia();
		return vehicle;
	}
}
