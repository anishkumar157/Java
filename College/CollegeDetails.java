public class CollegeDetails{

	HeadOfDepartment[] hod;
	Principal principal;
	Students[] student;
	Professors[] professors;


	public CollegeDetails(HeadOfDepartment[] hod, Principal principal, Students[] student, Professors[] professors){
		this.hod = hod;
		this.principal = principal;
		this.student = student;
		this.professors = professors;
	}

	public CollegeDetails(){

	}
}