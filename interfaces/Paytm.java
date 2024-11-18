package com.xworkz.interfaces;

public class Paytm implements PaymentSend, PaymentRecieve {

	@Override
	public void recieveMoneyUsingQR() {
		System.out.println("Paytm Recieved Using QR Code");
		
	}

	@Override
	public void recieveMoneyUsingnumber() {
		System.out.println("Paytm Recieved Using Number");
		
	}

	@Override
	public void payMoneyUsingScanner() {
		System.out.println("Paytm Send using Scanner");
		
	}

	@Override
	public void payMoneyusingNumber() {
		System.out.println("Paytm Send using Number");		
	}

}
