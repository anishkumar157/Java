public class ResidentialHouse{

	static String type;
	static String material;
	static Boolean hasCarporch;

	 String location;
    int price;
    String bhk;
    float area; 

	static {

		type = "Residential";
   		material = "Brick";
   		hasCarporch = true;
	}
        
   

    public ResidentialHouse(String location, int price, String bhk, float area ){
    	this.location = location;
    	this.price = price;
    	this.bhk = bhk;
    	this.area = area;
    }

    public void printDetails(){

    	System.out.println("House Type: "+type);
    	System.out.println("House Material: "+material);
    	System.out.println("Is Car porch there: "+hasCarporch);
    	System.out.println("House Location: "+location);
    	System.out.println("House Price: "+price);
    	System.out.println("House BHK: "+bhk);
    	System.out.println("Square Feet: "+area);
    }
}