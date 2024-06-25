package com.techmojo.beans;

public class Fortuner implements Car {

	@Override
	public void turnDirection() {
		System.out.println("Turn the car");

	}

	@Override
	public void accelerate() {
		System.out.println("Speed the car");

	}

	@Override
	public void stop() {
		System.out.println("Stop the car");

	}
	
	public void fourWheel() {
		System.out.println("Four wheeel");
	}

}
