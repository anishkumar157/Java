public class Exam2{
	public static void main(String[] args) {
		int[] array1 = {1,5,2,7,6,8,9,4,8,4,1,3,8,11,15,1,6,20,19,40};

		int[] array2 = new int[20];

		//Left to Right
		System.out.println("Left to Right ");

		for(int i=0; i<array1.length;i++){
			System.out.print(array1[i]+", ");
		}

		// Right to Left
		System.out.println("\n Right to Left");

			for(int i=array1.length-1; i>=0;i--){
			System.out.print(array1[i]+", ");
		}

		// Middle to Left
		System.out.println(" \nMiddle to Left");

			for(int i=array1.length/2; i<array1.length;i++){
			System.out.print(array1[i]+", ");
		
			}
				// Skipping 1 Element
		System.out.println(" \nRight to Left");

			for(int i=0; i>=array1.length;i+=1){
			System.out.print(array1[i]+", ");
		}

		
	}
}