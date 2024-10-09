public class MethodOverloadingExample{

	public static void main(String[] args) {
		

		System.out.println("*****************Area calculator method****************");
		
		areaCalculator(16);
		areaCalculator(10.5f);
		areaCalculator(8 ,7.5f);
		areaCalculator(7.5f, 6);


		System.out.println("*****************Personal Details method****************");

		personDetails("Anish");
		personDetails(24);
		personDetails("Anish" ,24);
		personDetails(24, "Anish");


		System.out.println("*****************Details of Stocks in Warehouse method****************");

		stocksInWarehouse("Phones");
		stocksInWarehouse(2400);
		stocksInWarehouse("Phones", 2400, 125000.40f);
		stocksInWarehouse(125000.45f, "phones", 2400);


		System.out.println("****************Example for Variable argument  method****************");

		findAverage(8, 6, 2, 56);

	}
// fist method
	// deffferent datatype with same method_name
	public static void areaCalculator(int sides){
		int areaOfSquare = sides * sides;
		System.out.println("Area of Square = "+ areaOfSquare);
	}

	public static void areaCalculator(float sides){
		float areaOfSquare = sides * sides;
		System.out.println("Area of Square = "+ areaOfSquare);

	}

		// same name and defferent parameater number

	public static void areaCalculator(int length, float width){
		float areaOfSquare = length * width;
		System.out.println("Area of Rectangle = "+ areaOfSquare);
	}

	// same name and defferent order of parameter

	public static void areaCalculator(float width, int length){
		float areaOfSquare = width * length;
		System.out.println("Area of Rctangle = "+ areaOfSquare);

	}

// second method
	// deffferent datatype with same method_name
	public static void personDetails(String name){
		System.out.println(name);
	}

	public static void personDetails(int age){
		System.out.println(age);
	}

			// same name and defferent parameater number


	public static void personDetails(String name, int age){
		System.out.println(name+" "+age);
	}

	// same name and defferent order of parameter

	public static void personDetails(int age, String name){
		System.out.println(name+" "+age);
	}


// third method
	// deffferent datatype with same method_name
	public static void stocksInWarehouse(String itemName){
		System.out.println(itemName);
	}

	public static void stocksInWarehouse(int numberOfStocks){
		System.out.println(numberOfStocks);
	}

			// same name and defferent parameater number


	public static void stocksInWarehouse(String itemName, int numberOfStocks, float price){
		System.out.println("name: "+itemName+" Price: "+price+" Number of Stock Left: "+numberOfStocks);
	}

	// same name and defferent order of parameter

	public static void stocksInWarehouse(float price, String itemName, int numberOfStocks){
	System.out.println("name: "+itemName+" Price: "+price+" Number of Stock Left: "+numberOfStocks);
	}

// 4 th method for variable argument example.

	public static void findAverage(int... value){
		int sum=0;
		int avg=0;
		for(int i=0; i<value.length;i++){
			sum+=value[i];
		}
		avg=sum/value.length;
		System.out.println("average= "+avg);
	}


}