public class SrinivasCollege extends CollegeDetails{
	
	int numberOfFestivals;
	

	public SrinivasCollege(HeadOfDepartment[] hod, Principal principal, Students[] student, Professors[] professors, int numberOfFestivals){
		super(hod, principal, student, professors);
		this.numberOfFestivals = numberOfFestivals;
	}

	public void printDetails(){

		System.out.println("\n_________SRINIVAS COLLEGE DETAILS_________");

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

		System.out.println("\nNumber of Festivals is:"+numberOfFestivals);
		
	}
}