public class Diesel extends PetroleumProducts{
	
	float stateGstDiesel;



	public Diesel(String name, float basePrice, float centralGst, float stateGstDiesel){

		super(name, basePrice, centralGst);
		this.stateGstDiesel = stateGstDiesel;
	}



	@Override
	public void calculatePriceWithGST(){

		float totalGstRate = centralGst + stateGstDiesel;
		float finalPrice = basePrice + (basePrice * totalGstRate / 100);
		System.out.println("Final price of Diesel with GST is: " + finalPrice + " per liter");
	}

}