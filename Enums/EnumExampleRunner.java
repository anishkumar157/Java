public class EnumExampleRunner{

	public static void main(String[] args) {
		EnumExample example = new EnumExample(DaysInWeek.THURSDAY, Months. OCTOBER, TraficSignal.RED, 
		BloodGroups.O, Genders.MALE, SeasonsInYear.WINTER, EducationLevel.PUC,	ColorsInRainbow.VIOLET,
		ExamResult.PASS, OrderStatus.SHIPED);

		example.printDetails();
		
	}

}