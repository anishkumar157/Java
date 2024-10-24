public class BankAccounts{ 

    static String bankName;
    static String country;
    static double interestRate;


    String accountNumber;
    String accountHolderName;
    double balance;
    AccountType accountType; 

    static {

         bankName = "SBI";
         country = "India";
         interestRate = 2.5;
    }
        
   

    public BankAccounts(String accountNumber, String accountHolderName, double balance, AccountType accountType){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void printDetails(){

        System.out.println("Bank Name: "+bankName);
        System.out.println("Country: "+country);
        System.out.println("Rate of Intrest: "+interestRate);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance Amount: "+balance);        
        System.out.println("genre: "+accountType);
    }
}