package com.xworkz.typeCasting;

public class TypeCastingRunnerExample {
	public static void main(String[] args) {
		
		
		System.out.println(" =============Primitive Up Casting=============");
		

        // Example Primitive Up Casting 1: int to double 
        int personAge = 28;
        double lifeExpectancy = personAge; 
        System.out.println(" Upcasted age to life expectancy (int to double): " + lifeExpectancy);

        // Example Primitive Up Casting 2: byte to int
        byte roomTemperatureCelsius = 22;
        int globalTemperature = roomTemperatureCelsius; 
        System.out.println(" Upcasted room temperature to global temperature (byte to int): " + globalTemperature);

        // Example Primitive Up Casting 3: short to float 
        short monthlyRainfall = 120;
        float yearlyRainfall = monthlyRainfall; 
        System.out.println(" Upcasted monthly rainfall to yearly rainfall (short to float): " + yearlyRainfall);

        // Example Primitive Up Casting 4: int to double 
        int distanceInMeters = 150; 
        double distanceInKilometers = distanceInMeters; 
        System.out.println(" Upcasted distanceInMeters to distanceInKilometers value (float to double): " +distanceInKilometers);
        
        
        System.out.println("\n =============Primitive Up Casting=============");
        
        
     // Example Primitive Down Casting 1: double to foat 
        double piValue = 3.14159265359f;
        float pi = (int) piValue; 
        System.out.println(" Downcasted Actual pi value to rounded pi value (double to int): " + pi);

        // Example Primitive Down Casting 2: float to byte 
        float highTemperature = 127.5f;
        byte sensorTemperature = (byte) highTemperature; 
        System.out.println(" Downcasted high temperature to sensor range (float to byte): " + sensorTemperature);

        // Example Primitive Down Casting 3: int to short 
        int cityPopulation = 32000;
        short smallPopulationCount = (short) cityPopulation; 
        System.out.println(" Downcasted population to smaller range (int to short): " + smallPopulationCount);

        // Example Primitive Down Casting 4: long to int 
        long largeFileSize = 1000000000L;
        int appFileSize = (int) largeFileSize;
        System.out.println(" Downcasted large file size to app limit (long to int): " + appFileSize);
        
        
        System.out.println("\n =============Class Up Casting=============");
        
        //Example Class Up Casting 1: Bike to Vehicle  
        Vehicle myBike = new Bike(); //Up Casting
        myBike.startEngine();
        
        // Example Class Up Casting 2: Car to Vehicle  
        Vehicle myCar = new Car(); //Up Casting
         myCar.startEngine();
         
         System.out.println("\n =============Class Down Casting=============");
         
         // Example Class Down Casting 1: Vehicle to Bike  
         Vehicle bike = new Bike(); //Up Casting
         Bike bike1 = (Bike) bike; //Down Casting
         bike1.startEngine();
         
         
         // Example Class Down Casting 2: Vehicle to Car
         Vehicle car = new Car();
         Car car1 = (Car) car; //Up Casting
         car1.startEngine(); //Down Casting
         
        
        
	}

}
