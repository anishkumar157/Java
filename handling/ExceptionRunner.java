package com.xworkz.Exeptionexample.handling;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionRunner {
	public static void main(String[] args) {
		
		try {
			FileInputStream inputStream = new FileInputStream("C:/Users/anish/OneDrive/Desktop/sujay/Exceptions/Runner.java");
			Class.forName("java.lang.String");
			int a = 10/0;
		}
		
		catch(IOException e){
			
			System.out.println("Class not found exception");
			
			e.printStackTrace();
			
		}
		
		catch(ClassNotFoundException e) {
			System.err.println("class not found exception");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
		System.err.println("arithmetic exception");
			e.printStackTrace();
		}
	}

}
