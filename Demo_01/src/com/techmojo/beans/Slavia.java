package com.techmojo.beans;

public class Slavia implements Car {

	@Override
	public void turnDirection() {
		System.out.println("Turn the car");

	}

	@Override
	public void accelerate() {
		System.out.println("Speed up");

	}

	@Override
	public void stop() {
		System.out.println("Stop car");

	}
	
	public void sunRoof() {
		System.out.println("Open Sunroof");
	}

}
