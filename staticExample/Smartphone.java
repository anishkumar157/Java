public class Smartphone{

	static String os;
    static boolean hasTouchscreen;
    static String connectivity;


	String brand;
    int price;
    int storage;
    float screenSize; 

	static {

		  os = "Android";
    	  hasTouchscreen = true;
    	  connectivity = "5G";
	}
        
   

    public Smartphone(String brand, int price, int storage, float sceenSize ){
    	this.brand = brand;
    	this.price = price;
    	this.storage = storage;
    	this.screenSize = screenSize;
    }

    public void printDetails(){

    	System.out.println("Phone os: "+os);
    	System.out.println("Is Touch screen : "+hasTouchscreen);
    	System.out.println("connectivity: "+connectivity);
    	System.out.println("Phone Brand: "+brand);
    	System.out.println("Price: "+price);
    	System.out.println("Storage Capacity: "+storage);
    	System.out.println("Screen Size: "+screenSize);
    }
}