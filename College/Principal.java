public class Principal extends StaffDetails{

	int yearOfExperience;

	public Principal(String name, int age, float salary, int yearOfExperience){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.yearOfExperience = yearOfExperience;
	}

	public void printDetails(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Salary is:"+salary);
		System.out.println("Year Of Experience is:"+yearOfExperience);
	}
}