package com.xworkz.AccessSpecifiers.details;

public class VehicleUser {
		
		 public String name;
		    protected int age;
		    String userDLNumber; 
		    private int experience;
		
	    public VehicleUser() {
	        this.name = "Anish";
	        this.userDLNumber = "KL025871";
	        System.out.println("Vehicle User created with default values.");
	    }


	    private VehicleUser(int age) {
	        this.age = age;
	        System.out.println("Vehicle User created with age: " + age);
	    }


	    public void start() {
	        System.out.println("Vehicle started by: " + name);
	    }

	 
	    protected void drive() {
	        
	        System.out.println("Vehicle Moved.");
	    }

	  
	    void airConditionStatus() {
	        System.out.println("Air Condition is on.");
	    }


	    private void MusicalSystemStatus(String password) {
	        
	        System.out.println("Musica lSystem is on.");
	    }

	}



