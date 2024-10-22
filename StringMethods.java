public class StringMethods{
	public static void main(String[] args) {

		//Concat
		System.out.println("**************Concatenate Strings**************");
		String firstName = "Athul";
		String lastName =" V Kumar";
		String fullName = firstName.concat(lastName);
		System.out.println(fullName);

		//toUpper
		System.out.println("");
		System.out.println("*************String to Upper Case**************");
		String movieName = "bangalore days";
		String nameUpper = movieName.toUpperCase();
		System.out.println(nameUpper);

		//toLower
		System.out.println("");
		System.out.println("*************String to Lower Case*************");
		String carName = "LAMBORGHINI";
		String carNameLower = carName.toLowerCase();
		System.out.println(carNameLower);

		//trim
		System.out.println("");
		System.out.println("*************String Trim*************");
		String bankName = "    SBI    ";
		String nameTrim = bankName.trim();
		System.out.println(nameTrim);

		//isEmpty
		System.out.println("");
		System.out.println("*************String is Empty or not*************");
		String value = "";
		Boolean valueEmpty = value.isEmpty();
		System.out.println(valueEmpty);

		//split
		System.out.println("");
		System.out.println("*************Split String*************");
		String ownerName = "Maneesh Kavu";
		String[] nameSplit = ownerName.split(" ");
		System.out.println(nameSplit[0]);
		System.out.println(nameSplit[1]);

		//is Palindrome
		String name = "malayalam";
		isPalindrome(name);

		//second smallest
		int[] array = {12,2,8,50,100,5,98};
		int secondSmallest = findSecondSmallest(array);
		System.out.println(secondSmallest);
	}

	public static void isPalindrome(String name){

		char[] charArray = name.toCharArray();
		String reversedArray= "";
		for(int i = charArray.length-1; i>=0; i--){
			reversedArray = reversedArray + charArray[i];
		}

		if(reversedArray.equals(name)){
			System.out.println("The String is Palindrome");
		}
		else{
			System.out.println("The String is Not Palindrome!!!");
		}


	}
	public static int findSecondSmallest(int[] array){

		int smallestValue = array[0];
		int secondSmallestValue = 0;
		int n = array.length;
		for(int i = 1; i < n; i++){
			if(array[i] < smallestValue){
				secondSmallestValue = smallestValue;
				smallestValue = array[i];
			}
			else if(array[i] < secondSmallestValue) {

				secondSmallestValue = array[i];

			}
		}
		return secondSmallestValue;
	}
}