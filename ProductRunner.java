public class ProductRunner{

	 static Product[] products = new Product[8];							// Creating object array.

	public static void main(String[] args) {
		
		Product product1 = new Product("Laptop", "Electronics", 20, 50000f);
		Product product2 = new Product("Table", "Furniture", 12, 500f);
		Product product3 = new Product("Mobile", "Electronics", 10, 20000f);
		Product product4 = new Product("Clothes", "Wearabels", 50, 1000f);
		Product product5 = new Product("Fridge", "Home Appliance", 20, 15000f);
		Product product6 = new Product("Earphone", "Electronics", 5, 250f);
		Product product7 = new Product("Mouse", "Electronics", 20, 7000f);
		Product product8 = new Product("KeyBoard", "Electronics", 10, 350f);


		saveProducts(product1);
		saveProducts(product2);												// invoking methods for saving the data.
		saveProducts(product3);
		saveProducts(product4);
		saveProducts(product5);
		saveProducts(product6);
		saveProducts(product7);
		saveProducts(product8);	


		for(int i = 0; i < products.length; i++){							// loop used to print the values from the array 
			if(products[i]!=null){											// checking if the value is availabe; in the array
				products[i].productDetails();								// invoking the method to display the values in the array by using array index.
			}
		}	




	}

	public static boolean saveProducts(Product product){
		for(int i = 0; i < products.length; i++){							// iterating through array
			if(products[i] == null){										// checking for blank space
				products[i] = product;										// storing 
				System.out.println("Data has been saved");
				return true;												// giving result
			}
		}
		System.out.println("Sorry data Could not be inserted!!!");
				return false;
	} 

}


