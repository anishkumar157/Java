package com.xworkz.interfaces;

import java.security.DomainCombiner;

public class PayRunner {

	public static void main(String[] args) {
		
		GooglePay gPay = new GooglePay();
	
		gPay.payMoneyusingNumber();
		gPay.recieveMoneyUsingnumber();
		gPay.payMoneyUsingScanner();
		gPay.recieveMoneyUsingQR();
		
		Paytm paytm = new Paytm();
		paytm.payMoneyUsingScanner();
		paytm.recieveMoneyUsingQR();
		paytm.payMoneyusingNumber();
		paytm.recieveMoneyUsingnumber();
	}
}
