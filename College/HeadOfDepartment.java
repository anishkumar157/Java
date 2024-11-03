public class HeadOfDepartment extends StaffDetails{

	String nameOfDepartment;

	public HeadOfDepartment(String name, int age, float salary, String nameOfDepartment){

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.nameOfDepartment = nameOfDepartment;
	}

	public void printDetails(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Salary is:"+salary);
		System.out.println("Name Of Department is:"+nameOfDepartment);
	}
}