package com.xworkz.Exeptionexample;

public class Runner {
	
	public static void main(String[] args) {
       
        String myString = null;

        

     
        if (myString != null) {
            System.out.println("hello");
        } else {
            System.out.println("strinh is null");
        }
    
	
	
	 Fridge fridge = new Fridge();

     
     Object obj = fridge;

     if (obj instanceof Fridge) {
         Fridge fridges = (Fridge) obj;
         fridges.start();
     } else {
         System.out.println("Object is not an instance of Manager. Downcasting not possible.");
     }

     
     if (obj instanceof Elecronics) {
    	 Elecronics electronics = (Elecronics) obj;
         electronics.start();
     } else {
         System.out.println("Object is not an instance of Employee. Downcasting not possible.");
     }
	}
}

