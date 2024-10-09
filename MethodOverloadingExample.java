public class MethodOverloadingExample{

	public static void main(String[] args) {

		System.out.println("*****************Area calculator method****************");
		// deffferent datatype with same method_name
		areaCalculator(16);
		areaCalculator(10.5f);
		// same name and defferent parameater number
		areaCalculator(8 ,7.5f);
		// same name and defferent order of parameter
		areaCalculator(7.5f, 6);
		System.out.println("*****************Area calculator method****************");
		// deffferent datatype with same method_name
		personDetails("Anish");
		personDetails(24);
		// same name and defferent parameater number
		personDetails("Anish" ,24);
		// same name and defferent order of parameter
		personDetails(24, "Anish");

	}

	public static void areaCalculator(int sides){
		int areaOfSquare = sides * sides;
		System.out.println("Area of Square = "+ areaOfSquare);
	}

	public static void areaCalculator(float sides){
		float areaOfSquare = sides * sides;
		System.out.println("Area of Square = "+ areaOfSquare);

	}

	public static void areaCalculator(int length, float width){
		float areaOfSquare = length * width;
		System.out.println("Area of Rectangle = "+ areaOfSquare);
	}

	public static void areaCalculator(float width, int length){
		float areaOfSquare = width * length;
		System.out.println("Area of Rctangle = "+ areaOfSquare);

	}

	public static void personDetails(String name){
		System.out.println(name);
	}

	public static void personDetails(int age){
		System.out.println(age);
	}

	public static void personDetails(String name, int age){
		System.out.println(name+" "+age);
	}

	public static void personDetails(int age, String name){
		System.out.println(name+" "+age);
	}

}