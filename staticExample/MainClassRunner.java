public class MainClassRunner{

	public static void main(String[] args) {
		ResidentialHouse house = new ResidentialHouse("Bengaluru", 500000,"2BHK", 1000.00f);
		house.printDetails();
		System.out.println("\n");

		Smartphone phone = new Smartphone("realme", 50000,128, 6.00f);
		phone.printDetails();
		System.out.println("\n");

		LaptopInfo lap = new LaptopInfo("HP", 100000,500, 16.00f);
		lap.printDetails();
		System.out.println("\n");

		BookInfo book = new BookInfo("Dance Of Ice And Fire", "Sumanth",500, "Frictional");
		book.printDetails();
		System.out.println("\n");

		BankAccounts bank = new BankAccounts("sbi30003774718", "Maneesh",500d, AccountType.Savings);
		bank.printDetails();
		System.out.println("\n");
	}
}