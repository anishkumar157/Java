package com.xworkz.AccessSpecifiers;

public class Vehicle {
		
		public String name;
		protected double fuelLevel;
	    int year;
	    private String model;
	    
	    
	    
	    public Vehicle() {
	        this.name = "tata";
	        this.year = 2016;
	        System.out.println("Default Constructor Executed");
	        
	    }

	    
	    private Vehicle(String model) {
	        this.model = model;
	        System.out.println("Private Constructor Executed");
	    }

	   
	    public void start() {
	        System.out.println("Vehicle started");
	    }

	    
	    protected void drive() {
	        System.out.println("Vehicle moved.");
	    }

	   
	    void airConditionStatus() {
	        System.out.println("Air Condition on");
	    }

	    
	    private void MisicalSystemStatus() {
       	        System.out.println("Musical system is on" );
	    }
	
	
}
