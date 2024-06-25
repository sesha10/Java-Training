package com.techmojo.app;

import com.techmojo.beans.Car;
import com.techmojo.beans.CarFactory;
import com.techmojo.beans.Fortuner;
import com.techmojo.beans.Slavia;

public class VehicleApp {

	public static void main(String[] args) {
		Car vehicle = CarFactory.getVehicle();
		
		// Turn direction of the car
		vehicle.turnDirection();
		// Accelerate car
		vehicle.accelerate();
		//Stop the car
		vehicle.stop();
		// Accelerate the car
		vehicle.accelerate();
		// Stop the car
		vehicle.stop();

	}
}