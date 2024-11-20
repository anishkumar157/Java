package com.xworks.EnterpriceCrud;

import com.xworks.EnterpriceCrud.Entity.SuperMarket;
import com.xworks.EnterpriceCrud.Services.SuperMarketServices;
import com.xworks.EnterpriceCrud.Services.SuperMarketservicesImpl;

public class EnterpriceRunner {
	public static void main(String[] args) {
		
		SuperMarketServices market = new SuperMarketservicesImpl();
		SuperMarket superMarket = new SuperMarket("Santhoor", "Soap", 60, 5, 1);
		
		market.validateSuperMarket(superMarket);
	}
}
