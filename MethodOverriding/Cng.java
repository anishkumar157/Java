public class Cng extends PetroleumProducts{
	
	float stateGstCng;
	float subsidy;





	public Cng(String name, float basePrice, float centralGst, float stateGstCng, float subsidy){

		super(name, basePrice, centralGst);
		this.stateGstCng = stateGstCng;
		this.subsidy = subsidy;
	}




	@Override
	public void calculatePriceWithGST(){

		float finalPrice = (basePrice - subsidy) + ((basePrice - subsidy) * stateGstCng / 100);
		System.out.println("Final price of Diesel with GST is: " + finalPrice + " per liter");
	}

}