public class MethodSession{

	public static void main(String[] args) {

		additionOfTwoNumbers();
		multiplicationOfTwoNumbers();
		average();
		sumOfFirstTenNaturalNumbers();
		squareRoot();
		addArray();
		addThreenumbers();
		substractionOfTwoNumbers();
		divisionOfTwoNumbers();
		areaOfCircle();

	}

	public static void additionOfTwoNumbers(){

		int numberOne = 10;
		int numberTwo = 20;
		int sumOfTwoNumber = numberOne+numberTwo;
		System.out.println("Sum of Two number is: "+sumOfTwoNumber); 
	}

	public static void multiplicationOfTwoNumbers(){

		int valueOne = 5;
		int valueTwo = 4;
		float productOfTwoNumbers = valueOne+valueTwo;
		System.out.println("product of Two Numbers is: "+productOfTwoNumbers);
	}

	public static void average() {
        int firstNumber = 10;
        int secondNumber = 5;
        double averageValue = (firstNumber + secondNumber) / 2.0;
        System.out.println("Average of two numbers: " + averageValue);
    }

    public static void sumOfFirstTenNaturalNumbers(){

    	int sumNaturalNumber = 0;
    	for (int i = 1;i <= 10 ;i++ ) {
    		sumNaturalNumber+=i;
    	}
    }

    public static void squareRoot() {

       int number = 8;
       double sqrt = Math.sqrt(number);
       System.out.println("Square root of " + number + ": " + sqrt);
    }

    public static void addArray() {
        int[] arryNumber = {1, 2, 3, 4, 5};
        int arraySum = 0;
        for (int number : arryNumber) {
            arraySum += number;
        }
        System.out.println("Addition of array: " + arraySum);
    }

    public static void addThreenumbers(){

    	int numberOne = 30;
    	int numberTwo = 10;
    	int numberThree = 10;
    	int sumOfThreeNumbers = numberOne+numberTwo+numberThree;
    	System.out.println("Sum of three Numbers is: "+sumOfThreeNumbers);
    }

    public static void substractionOfTwoNumbers(){

    	int numberOne = 16;
    	int numberTwo = 8;
    	int differenceOfTwoNumbers = numberOne-numberTwo;
    	System.out.println("Difference Between Two Numbers is: "+differenceOfTwoNumbers);
    }

    public static void divisionOfTwoNumbers(){

    	int numberOne = 45;
    	int numberTwo = 6;
    	float quotientOftwoNumber = numberOne/numberTwo;
    	System.out.println("The Quotient Of two Number is: "+quotientOftwoNumber);
    }

    public static void areaOfCircle(){

    	double radiusOfCircle = 6d;
    	double areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
    	System.out.println("Area of Circe is: "+areaOfCircle);
    }
}