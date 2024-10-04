public class ReturnTypeExample{

	public static void main(String[] args) {
		
		byte byteReturnedValue = getByteValue();
		short shortReturnedValue = getShortValue();
		int intReturnedValue = getIntValue();
		long longReturnedValue = getLongValue();
		float floatReturnedValue = getFloatValue();
		double doubleReturnedValue = getDoubleValue();
		char charReturnedValue = getCharValue();
		boolean boolReturnedValue = getBooleanValue();

		System.out.println("Returned Byte value is: "+byteReturnedValue);
		System.out.println("Returned Short value is: "+shortReturnedValue);
		System.out.println("Returned Int value is: "+intReturnedValue);
		System.out.println("Returned Long value is: "+longReturnedValue);
		System.out.println("Returned Float value is: "+floatReturnedValue);
		System.out.println("Returned Double value is: "+doubleReturnedValue);
		System.out.println("Returned Char value is: "+charReturnedValue);
		System.out.println("Returned Boolean value is: "+boolReturnedValue);

	}

	public static byte getByteValue(){
		System.out.println("Declaring a  byte value");
		byte value = 127;
		System.out.println("Returning Byte Value");
		return value;
	}

	public static short getShortValue(){
		System.out.println("Declaring a  short value");
		short value = 999;
		System.out.println("Returning short Value");
		return value;
	}

	public static int getIntValue(){
		System.out.println("Declaring a  int value");
		int value = 2147483647;
		System.out.println("Returning int Value");
		return value;
	}

	public static long getLongValue(){
		System.out.println("Declaring a  long value");
		long value = 7907393481l;
		System.out.println("Returning long Value");
		return value;
	}

	public static float getFloatValue(){
		System.out.println("Declaring a  float value");
		float value = 1.25f;
		System.out.println("Returning float Value");
		return value;
	}

	public static double getDoubleValue(){
		System.out.println("Declaring a  double value");
		double value = 1.123456078984d;
		System.out.println("Returning double Value");
		return value;
	}

	public static char getCharValue(){
		System.out.println("Declaring a  char value");
		char value = 'A';
		System.out.println("Returning char Value");
		return value;
	}

	public static boolean getBooleanValue(){
		System.out.println("Declaring a  boolean value");
		boolean value = true;
		System.out.println("Returning boolean Value");
		return value;
	}


}