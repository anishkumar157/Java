public class SmartLightInfo{
	String brandName;
	String color;
	int brightness;
	String on_Or_Off;

	public SmartLightInfo(){
		System.out.println("*************************************************");

		System.out.println("Non Parameterized Constructor");
	}

	public SmartLightInfo(String brandName, String color, int brightness, String on_Or_Off){

		
		this.brandName = brandName;
		this.color = color;
		this.brightness = brightness;
		this.on_Or_Off = on_Or_Off;
	}


	public static void turnOn_TurnOff(){

	}

	public static void adjustBrightness(){

	}

	public void lightDetails(){
		System.out.println("*************************************************");
		System.out.println("Light Brand: "+brandName);
		System.out.println("Light Color: "+brandName);
		System.out.println("Is Light On/Off: "+brandName);
		System.out.println("Light Brightness: "+brandName);
		System.out.println("Light Brand: "+brandName);


	}
}