public class Exam1{

	public static void addWithNoParam(){
		int number1=10;
		int number2=20;
		int sum= number1+number2;
		System.out.println("sum of two numbers is: "+sum);
	}

	public static void additionWithParam(int number1,int number2){
		int sum=number1+number2;
		System.out.println("sum of two numbers is: "+sum);
	}

	public static void main(String[] args) {
		System.out.println("add With No Param ");
		addWithNoParam();
		
		
		System.out.println("\nadd With Param ");
		additionWithParam(150,50);

	}
	
}