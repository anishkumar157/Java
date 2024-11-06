public class PetroleumProducts{
	String name;
	float basePrice;
	float centralGst;


	public PetroleumProducts(String name, float basePrice, float centralGst){
		this.name = name;
		this.basePrice = basePrice;
		this.centralGst = centralGst;
	}



	public void calculatePriceWithGST(){

		float finalPrice = basePrice + (basePrice * centralGst / 100);
		System.out.println("Final price of " + name + " with GST is: " + finalPrice + " per liter");
	}
}