public class PetroliumRunner{

	public static void main(String[] args) {
		
		Diesel diesel = new Diesel("Diesel", 65.00f, 18.5f, 19.00f);
		diesel.calculatePriceWithGST();


		Petrol petrol = new Petrol("Petrol", 55.00f, 18.00f, 18.00f);
		petrol.calculatePriceWithGST();


		Cng cng = new Cng("CNG", 60.00f, 18.00f, 18.00f, 16.00f);
		cng.calculatePriceWithGST();
	}
	
}