public class LaptopInfo{ 

    static String operatingSystem;
    static boolean hasKeyboard;
    static String defaultBrowser;

    String brand;
    int price;
    int ramSize;
    float screenSize; 

    static {

         operatingSystem = "Windows";
         hasKeyboard = true;
         defaultBrowser = "Edge";
    }
        
   

    public LaptopInfo(String brand, int processor, int ramSize, float sceenSize ){
        this.brand = brand;
        this.price = price;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
    }

    public void printDetails(){

        System.out.println("Laptop os: "+operatingSystem);
        System.out.println("Is Keyboard available : "+hasKeyboard);
        System.out.println("Default Browser: "+defaultBrowser);
        System.out.println("Laptop Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("RAM: "+ramSize);
        System.out.println("Screen Size: "+screenSize);
    }
}