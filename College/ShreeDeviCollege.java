public class ShreeDeviCollege extends CollegeDetails{
	
	int numberOfDepartments;
	int numberOfClassRooms;

	public ShreeDeviCollege(HeadOfDepartment[] hod, Principal principal, Students[] student, Professors[] professors, int numberOfDepartments, int numberOfClassRooms){
		super(hod, principal, student, professors);
		this.numberOfClassRooms = numberOfClassRooms;
		this.numberOfDepartments = numberOfDepartments;
	}

	public void printDetails(){

		System.out.println("_________SHREE DEVI COLLEGE DETAILS_________");

		for(int i = 0; i<hod.length; i++){
			System.out.println("\n**************hod details:******************\n");
			hod[i].printDetails();
		}

		
			System.out.println("\n**************Principal details:******************\n");
			principal.printDetails();
		

		for(int i = 0; i<professors.length; i++){
			System.out.println("\n**************Professors details:******************\n");
			professors[i].printDetails();
		}

		for(int i = 0; i<student.length; i++){
			System.out.println("\n**************Students details:******************\n");
			student[i].printDetails();
		}

		System.out.println("\nNumber of Department is:"+numberOfDepartments);
		System.out.println("Noumber of Classes is:"+numberOfClassRooms);
	}
}