public class Petrol extends PetroleumProducts{
	
	float stateGstPetrol;





	public Petrol(String name, float basePrice, float centralGst, float stateGstPetrol){

		super(name, basePrice, centralGst);
		this.stateGstPetrol = stateGstPetrol;
	}




	@Override
	public void calculatePriceWithGST(){

		float totalGstRate = centralGst + stateGstPetrol;
		float finalPrice = basePrice + (basePrice * totalGstRate / 100);
		System.out.println("Final price of Petrol with GST is: " + finalPrice + " per liter");
	}

}