public class StringExample{
	
	public static void main(String[] args) {
		
		String firstName = "Sumanth";				
		String lastName = "Acharya";
		String country = "India";
		String city = "Bengaluru";
		String progammingLanguage = "Java";
		String courseName = "Java Full Stack Development";
		String framework = "Spring Boot";
		String InstituteName = "Xworkz";
		String database = "MySQL";
		String codeEditor = "Sublime";



		String employeeFirstName = new String("Sumanth");
		String employeeLastName = new String("Acharya");
		String employeeCountry = new String("India");
		String jobLocation = new String("Chennai");
		String State = new String("Tamilnadu");
		String Designation = new String("Software Developer");
		String companyName = new String("Tata Cunsultancy");
		String managerName = new String("Maneesh");
		String teamLeaderName= new String("Athul V Kumar");
		String projectName = new String("Bike Rental Using java");


		System.out.println("***********Copmparing String Values using equls()**********");
		System.out.println(firstName.equals(employeeFirstName));


		System.out.println("***********Copmparing String Values using ==**********");
		System.out.println(firstName==employeeFirstName);
		System.out.println("*********** reversing a string**********");
		System.out.println("reversing string is:\n "+employeeFirstName);
		char[] charecterSting = firstName.toCharArray();
		String reversedString ="";
		for(int i=charecterSting.length-1;i>=0; i--){
			 reversedString = reversedString+charecterSting[i];
			
		}
		System.out.println("String after Reverse: \n"+reversedString);


	}
}