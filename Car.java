public class Car{
	String brandName;
	String kmPerLiter;
	int price;
	int topSpeed;
	String color;

	public Car(){
		System.out.println("\nNO Parameterized Constructor!!\n");
	}

	public Car(String brandName, String kmPerLiter, int price, int topSpeed, String color ){
		this.brandName = brandName;
		this. kmPerLiter= kmPerLiter;
		this.price=price;
		this. topSpeed=topSpeed;
		this.color=color;
	}

	public static void moveCar(){

	}
	public static void consumeFuel(){

	}
	public static void playmusic(){

	}

	public  void printDetails(){

		System.out.println("Barand name : "+brandName);
		System.out.println("Km/Liter : "+kmPerLiter);
		System.out.println("Price : "+price);
		System.out.println("Top Speed : "+topSpeed);
		System.out.println("Color : "+color);
		System.out.println("********************************\n");
	}

}