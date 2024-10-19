public class Product{
	String productName;
	String productType;
	int productQuantity;
	float productPrice;

	public Product(String prodctName, String productType, int productQuantity, float productPrice){

		this.productName = prodctName;
		this.productType = productType;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;

	}



	public  void productDetails(){
		// System.out.println("***************************************");
		System.out.println("Prodct Name: "+ productName);
		System.out.println("Prodct Type: "+ productType);
		System.out.println("Prodct Quantity: "+ productQuantity);
		System.out.println("Prodct Price: "+ productPrice+"\n");
	}



}