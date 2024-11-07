package com.xworkz.AccessSpecifiers;

import com.xworkz.AccessSpecifiers.details.VehicleUser;

public class VehicleRunner extends VehicleUser{
	
	public static void main(String[] args) {
	
	Vehicle vehicle = new Vehicle();
	System.out.println("name = "+vehicle.name);
	vehicle.start();
	
	
	System.out.println("FuelLevel = "+vehicle.fuelLevel);
	vehicle.drive();
	vehicle.airConditionStatus();
	
	
	VehicleUser user = new VehicleUser();
	System.out.println("name = "+user.name);
	user.start();
	
	VehicleRunner runner = new VehicleRunner();
	System.out.println("User Age = "+runner.age);
	runner.drive();
	
	
	
	
	
	
	}
}
