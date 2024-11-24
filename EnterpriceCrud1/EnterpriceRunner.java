package com.xworks.EnterpriceCrud;

import com.xworks.EnterpriceCrud.Entity.SuperMarket;
import com.xworks.EnterpriceCrud.Services.SuperMarketServices;
import com.xworks.EnterpriceCrud.Services.SuperMarketservicesImpl;

public class EnterpriceRunner {
	public static void main(String[] args) {
		
		SuperMarketServices market = new SuperMarketservicesImpl();
		SuperMarket superMarket1 = new SuperMarket("Santhoor", "Soap", 60, 5, 1);
		SuperMarket superMarket2 = new SuperMarket("Ponds", "Powder", 110, 5, 1);
		SuperMarket superMarket3 = new SuperMarket("Lifeboy", "Soap", 60, 5, 1);
		SuperMarket superMarket4 = new SuperMarket("Chandrika", "Soap", 60, 5, 1);
		
		
		market.validateSuperMarket(superMarket1);
		market.validateSuperMarket(superMarket2);
		market.validateSuperMarket(superMarket3);
		market.validateSuperMarket(superMarket4);
		
		SuperMarket foundData =market.findByProductName("Lifeboy");
		if(foundData != null) {
			foundData.printDetails();
		}
		
		SuperMarket[] readValue = market.readAll();
		System.out.println("==================Before Update==================");
		for (int i = 0; i < readValue.length; i++) {
			
			if(readValue[i] != null) {
				readValue[i].printDetails();
			}			
			
		}
		
		
		market.upadatePriceByName("Santhoor", 100);
		
		System.out.println("==================After Update==================");
		for (int i = 0; i < readValue.length; i++) {
					
			if(readValue[i] != null) {
				readValue[i].printDetails();
			}					
					
		}
		
		market.deleteByProductsName("Ponds");
		
		System.out.println("==================After Delete==================");
		for (int i = 0; i < readValue.length; i++) {
			
			if(readValue[i] != null) {
				readValue[i].printDetails();
			}			
			
		}
		
		
		System.out.println("***************\nFind, Update And Delete using product type\n******************");
		
		SuperMarket foundData1 =market.findByProductType("Soap");
		if(foundData1 != null) {
			foundData1.printDetails();
		}
		
		
		
		System.out.println("==================Before Update==================");
		for (int i = 0; i < readValue.length; i++) {
			
			if(readValue[i] != null) {
				readValue[i].printDetails();
			}			
			
		}
		
		
		market.upadatePriceByName("Santhoor", 200);
		
		System.out.println("==================After Update==================");
		for (int i = 0; i < readValue.length; i++) {
					
			if(readValue[i] != null) {
				readValue[i].printDetails();
			}					
					
		}
		
		market.deleteByProductsType("Soap");
		
		System.out.println("==================After Delete==================");
		for (int i = 0; i < readValue.length; i++) {
			
			if(readValue[i] != null) {
				readValue[i].printDetails();
			}			
			
		}
		
	}
}
