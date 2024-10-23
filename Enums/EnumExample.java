public class EnumExample{
	DaysInWeek day;
	Months month;
	TraficSignal signal;
	BloodGroups group;
	Genders gender;
	SeasonsInYear season;
	EducationLevel education;
	ColorsInRainbow color;
	ExamResult result;
	OrderStatus status;


	public EnumExample(DaysInWeek day, Months month, TraficSignal signal, 
		BloodGroups group, Genders gender, SeasonsInYear season, EducationLevel education, 
		ColorsInRainbow color, ExamResult result, OrderStatus status){
		this.day = day;
		this.month = month;
		this.signal = signal;
		this.group = group;
		this.gender = gender;
		this.season = season;
		this.education = education;
		this.color = color;
		this.result = result;
		this.status = status;

	}

	public void printDetails(){
		System.out.println("Day is: "+day);
		System.out.println("Month is: "+month);
		System.out.println("Signal is: "+signal);
		System.out.println("BloodGroup is: "+group);
		System.out.println("Gender is: "+gender);
		System.out.println("Season is: "+season);
		System.out.println("Level of Education is: "+education);
		System.out.println("Colro is: "+color);
		System.out.println("Result is: "+result);
		System.out.println("Order status is: "+status);

	}
}