public class CarRnner{
	
	public static void main(String[] args) {

		Car car1 = new Car();

		Car car2 = new Car("Toyota","20km",250000,150,"White");
		Car car3 = new Car("Tata","10km",200000,180,"White");
		Car car4 = new Car("KIA","18km",2600000,180,"Red");
		Car car5 = new Car("Suzuki","17km",30000,110,"Black");

		//car1("Toyota","200km",250000,150,"White");

		car2.printDetails();
		car3.printDetails();
		car4.printDetails();
		car5.printDetails();

	}
}