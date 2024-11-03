public class Students extends StudentDetails{

	String departmentName;

	public Students(String name, int age, String departmentName){

		this.name = name;
		this.age = age;
		this.departmentName = departmentName;
	}

	public void printDetails(){
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Department Name is:"+departmentName);
	}
}