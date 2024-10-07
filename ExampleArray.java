public class ExampleArray{

	public static void main(String[] args) {
		
		byte[] byteNumbers = {10, 20, 30, 25, 40, 50, 55, 60, 70, 80}; 
		short[] shortNumbers = {500,1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500,5000}; 
		int[] intNumbers = {85, 92, 78, 99, 67, 88, 76, 100,110,210}; 
		long[] longNumber = {100000L,150000L, 250000L, 500000L, 750000L, 1000000L, 1250000L, 1500000L, 1750000L,2000000L}; 
		float[] floatNumber = {12.5f, 25.75f, 19.99f, 36.55f, 99.99f, 49.50f, 29.95f, 15.25f, 79.99f,95.66f}; 
		double[] doubleNumber = {56.78d, 88.65d, 78.12d, 70.25d, 63.54d, 80.45d, 90.12d, 85.36d, 99.99d, 89.65d}; 
		char[] charecters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'}; 
		boolean[] boolValues = {true, false, true, true, false, true, false, false, false, true}; 

		System.out.println("**********************Byte array**********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<byteNumbers.length;i++)
		{
		System.out.println(byteNumbers[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=byteNumbers.length-1;i>=0;i--)
		{
		System.out.println(byteNumbers[i]);
		}
		System.out.println("Middle to right:");
		for(int i=5;i<byteNumbers.length;i++)
		{
		System.out.println(byteNumbers[i]);
		}
		System.out.println("Middle to left:");
		for(int i=5;i>=0;i--)
		{
		System.out.println(byteNumbers[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<byteNumbers.length;i=i+2)
		{
		System.out.println(byteNumbers[i]);
		}
		System.out.println("**********************Short Array**********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<shortNumbers.length;i++)
		{
		System.out.println(shortNumbers[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=shortNumbers.length-1;i>=0;i--)
		{
		System.out.println(shortNumbers[i]);
		}
		System.out.println("Middle to right:");
		for(int i=5;i<shortNumbers.length;i++)
		{
		System.out.println(shortNumbers[i]);
		}
		System.out.println("Middle to left:");
		for(int i=6;i>=0;i--)
		{
		System.out.println(shortNumbers[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<shortNumbers.length;i=i+2)
		{
		System.out.println(shortNumbers[i]);
		}
		System.out.println("********************** Integer Array **********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<intNumbers.length;i++)
		{
		System.out.println(intNumbers[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=intNumbers.length-1;i>=0;i--)
		{
		System.out.println(intNumbers[i]);
		}
		System.out.println("Middle to right:");
		for(int i=5;i<intNumbers.length;i++)
		{
		System.out.println(intNumbers[i]);
		}
		System.out.println("Middle to left:");
		for(int i=5;i>=0;i--)
		{
		System.out.println(intNumbers[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<intNumbers.length;i=i+2)
		{
		System.out.println(intNumbers[i]);
		}
		System.out.println("********************** Long Array **********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<longNumber.length;i++)
		{
		System.out.println(longNumber[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=byteNumbers.length-1;i>=0;i--)
		{
		System.out.println(longNumber[i]);
		}
		System.out.println("Middle to right:");
		for(int i=5;i<longNumber.length;i++)
		{
		System.out.println(longNumber[i]);
		}
		System.out.println("Middle to left:");
		for(int i=5;i>=0;i--)
		{
		System.out.println(longNumber[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<longNumber.length;i=i+2)
		{
		System.out.println(longNumber[i]);
		}
		System.out.println("********************** Float Array **********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<floatNumber.length;i++)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=floatNumber.length-1;i>=0;i--)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.print("Middle to right:");
		for(int i=5;i<floatNumber.length;i++)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.println("Middle to left:");
		for(int i=5;i>=0;i--)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<floatNumber.length;i=i+2)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.println("********************** Double Array **********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<doubleNumber.length;i++)
		{
		System.out.println(doubleNumber[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=doubleNumber.length-1;i>=0;i--)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.print("Middle to right:");
		for(int i=5;i<floatNumber.length;i++)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.println("Middle to left:");
		for(int i=5;i>=0;i--)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<floatNumber.length;i=i+2)
		{
		System.out.println(floatNumber[i]);
		}
		System.out.println("********************** Char Array **********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<charecters.length;i++)
		{
		System.out.println(charecters[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=charecters.length-1;i>=0;i--)
		{
		System.out.println(charecters[i]);
		}
		System.out.println("Middle to right:");
		for(int i=5;i<charecters.length;i++)
		{
		System.out.println(charecters[i]);
		}
		System.out.println("Middle to left:");
		for(int i=5;i>=0;i--)
		{
		System.out.println(charecters[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<charecters.length;i=i+2)
		{
		System.out.println(charecters[i]);
		}
		System.out.println("********************** Boolean Array **********************\n");
		System.out.println("Array elements from left to right:");
		for(int i=0;i<boolValues.length;i++)
		{
		System.out.println(boolValues[i]);
		}
		System.out.println("Array elements from right to left:");
		for(int i=boolValues.length-1;i>=0;i--)
		{
		System.out.println(boolValues[i]);
		}
		System.out.println("Middle to right:");
		for(int i=5;i<boolValues.length;i++)
		{
		System.out.println(boolValues[i]);
		}
		System.out.println("Middle to left:");
		for(int i=5;i>=0;i--)
		{
		System.out.println(boolValues[i]);
		}
		System.out.println("Skipping one index:");
		for(int i=0;i<boolValues.length;i=i+2)
		{
		System.out.println(boolValues[i]);
		}

	}
}            
