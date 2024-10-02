public class ParameterSession {

	public static void main(String[] args) {
		System.out.println("********************Invoking Email Method*********************");
		email("athul@gmail.com","parameter session");
		email("sumanth@gmail.com","Welcome to my java world");		
		email("anishkumarnaik5a@gmail.com","This is my parameter example");
		System.out.println("********************Invoking phone Call Method*********************");
		phoneCall(7896540321l,"Sumanth","+44");
		phoneCall(7907393481l,"Anish","+91");
		phoneCall(8899944615l,"Maneesh","+391");
		System.out.println("********************Invoking Login Method*********************");
		login("kumaraputhra@gmail.com","kumara@123");
		login("ragurama@gmail.com","ram@123");
		login("puthra@gmail.com","puthra@123");		
	}

	public static void email(String emailId,String subject){
		System.out.println("");
		System.out.println("Email: " + emailId);
		System.out.println("subject: '" + subject + "'");
	}

	public static void phoneCall(long mobNum,String name,String contryCode){
		System.out.println("");
		System.out.println("Phone Number is: "+mobNum);
		System.out.println("Name is: "+mobNum);
		System.out.println("Contry Code is: "+contryCode);
	}

	public static void login(String emailId,String password){
		System.out.println("");
		System.out.println("Email Id: "+emailId);
		System.out.println("Password: "+password);
	}
}