public class ProductInfo{
	
	static Product[] products = new Product[8];				 			// Creating object array.

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
		saveProducts(product2);									// invoking methods for saving the data.
		saveProducts(product3);
		saveProducts(product4);
		saveProducts(product5);
		saveProducts(product6);
		saveProducts(product7);
		saveProducts(product8);	

<<<<<<< HEAD

		// for(int i = 0; i < products.length; i++){							
		// 	if(products[i]!=null){											
		// 		products[i].productDetails();								
		// 	}
		// }	
=======
		
>>>>>>> 899f20e0004685ee16a8f2ff2ed1eff464e1d8dc
		System.out.println("\nFinding the Product\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		Product foundProduct=findByProductNmae("Laptop");					// Invking the Search Method
		Product foundProduct1=findByProductNmae("Earphone");					// Invking the Search Method
		// foundProduct.productDetails();
		// foundProduct1.productDetails();



		System.out.println("\nUpdating the  Product\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		updatByName("Laptop", 60000f);								// Invking the Updat Method
		updatByName("Earphone", 300f);								// Invking the Update Method


		System.out.println("\nDeleting the  the  Product\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
<<<<<<< HEAD

		System.out.println("\n********Before Delete!!**********\n");

		for(int i = 0; i < products.length; i++){							
			if(products[i]!=null){											
				products[i].productDetails();								
			}
		}	

		boolean result = deleteProductByName("Mouse");

		if(result == true){
				System.out.println("\n********After delete!!**********\n");

			for(int i = 0; i < products.length; i++){							
				if(products[i]!=null){											
					products[i].productDetails();								
				}
			}

		}

		else{

			System.out.println("\n No changes in array!!! \n");

		}

			
=======
>>>>>>> 899f20e0004685ee16a8f2ff2ed1eff464e1d8dc

		System.out.println("\n********Before Delete!!**********\n");

		for(int i = 0; i < products.length; i++){							
			if(products[i]!=null){											
				products[i].productDetails();						// Printing the array Data Before Deleting							
			}
		}	

		boolean result = deleteProductByName("Mouse");								// Ivoking the Delete Method.
		
		if(result == true){
			System.out.println("\n********After delete!!**********\n");

			for(int i = 0; i < products.length; i++){							
				if(products[i]!=null){											
					products[i].productDetails();						// Printing the array Data After Deleting							
				}
			}
		}
		else{
			System.out.println("\n There is No Changes has been Done in array \n");	
		}
	}
	

<<<<<<< HEAD
	public static boolean saveProducts(Product product){					// method for saving the data
		for(int i = 0; i < products.length; i++){							// iterating through array
			if(products[i] == null){										// checking for blank space
				products[i] = product;										// storing 
=======
	public static boolean saveProducts(Product product){
		for(int i = 0; i < products.length; i++){						// iterating through array
			if(products[i] == null){							// checking for blank space
				products[i] = product;							// storing 
>>>>>>> 899f20e0004685ee16a8f2ff2ed1eff464e1d8dc
				System.out.println("$Data has been saved$");
				return true;								// giving result
			}
		}
		System.out.println("Sorry data Could not be inserted!!!");
				return false;
	} 


<<<<<<< HEAD
	public static Product findByProductNmae(String name){			// Method for finding the data
=======
	public static Product findByProductNmae(String productName){					// Method For Finding Data

>>>>>>> 899f20e0004685ee16a8f2ff2ed1eff464e1d8dc
		for(int i=0; i<products.length;i++){
			if(products[i]!=null){
				if(products[i].productName.equals(name)){
					System.out.println("\n$Product found$");
					products[i].productDetails();
					return products[i];
				}
			}
		}

		System.out.println("product Not Found!!!!!!");
		return null;
	}


<<<<<<< HEAD
	public static boolean updatByName(String name, float price ){			// Method for Updating the data.
=======
	public static boolean updatByName(String name, float price ){					//Method for Updating the data

>>>>>>> 899f20e0004685ee16a8f2ff2ed1eff464e1d8dc
		for(int i=0; i<products.length;i++){
			if(products[i]!=null){
				if(products[i].productName.equals(name)){
					System.out.println("\n********Before Update!!**********\n");
					products[i].productDetails();

					products[i].productPrice=price;
					System.out.println("Data has been successfuly Updated");
					System.out.println("\n********After Update!!**********\n");
					products[i].productDetails();
					return true;
				}
			}
		}
		System.out.println("Data not found. Not updated");
		return false;
	}


<<<<<<< HEAD
	public static boolean deleteProductByName(String name){
=======
	public static boolean deleteProductByName(String name){						// method for  Deleting the Data.
>>>>>>> 899f20e0004685ee16a8f2ff2ed1eff464e1d8dc
		for(int i = 0; i < products.length; i++){
			if(products[i] != null){
				if(products[i].productName.equals(name)){
					products[i]=null;
					System.out.println("Data has been successfuly Deleted");
					return true;
				}
			}
		}
		System.out.println("Data not found. Cannot deleted");
		return false;

	}

}


