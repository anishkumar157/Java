public class SmartLight{
	
	public static void main(String[] args) {
		SmartLightInfo light1 = new SmartLightInfo();
		SmartLightInfo light2 = new SmartLightInfo();
		SmartLightInfo light3 = new SmartLightInfo();



		SmartLightInfo light4 = new SmartLightInfo("Philips", "White", 80, "On");
		SmartLightInfo light5 = new SmartLightInfo("Everyday", "Blue", 50, "Off");
		SmartLightInfo light6 = new SmartLightInfo("Surya", "Yellow", 20, "On");
		SmartLightInfo light7 = new SmartLightInfo("Anchor", "Warm", 40, "On");
		SmartLightInfo light8 = new SmartLightInfo("Philips", "Pink", 60, "On");
		SmartLightInfo light9 = new SmartLightInfo("Anchor", "White", 80, "Off");
		SmartLightInfo light10 = new SmartLightInfo("Crompton", "Green", 50, "Off");


		light4.lightDetails();
		light5.lightDetails();
		light6.lightDetails();
		light7.lightDetails();
		light8.lightDetails();
		light9.lightDetails();
		light10.lightDetails();



	}
}