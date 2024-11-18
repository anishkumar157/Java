package com.xworkz.interfaces;

public class GooglePay implements PaymentSend, PaymentRecieve {
	@Override
	public void recieveMoneyUsingQR() {
		System.out.println("GooglePay Recieved Using QR Code");
		
	}

	@Override
	public void recieveMoneyUsingnumber() {
		System.out.println("GooglePay Recieved Using Number");
		
	}

	@Override
	public void payMoneyUsingScanner() {
		System.out.println("GooglePay Send using Scanner");
		
	}

	@Override
	public void payMoneyusingNumber() {
		System.out.println("GooglePay Send using Number");		
	}

}

