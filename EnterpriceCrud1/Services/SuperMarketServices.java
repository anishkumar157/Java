package com.xworks.EnterpriceCrud.Services;

import com.xworks.EnterpriceCrud.Entity.SuperMarket;

public interface SuperMarketServices {
	
	public boolean validateSuperMarket(SuperMarket supermarket);
	
	public SuperMarket[] readAll();
	
	public SuperMarket findByProductName(String productName);
	
	public boolean upadatePriceByName(String productName, int price);
	
	public boolean deleteByProductsName(String productName);
	
	public SuperMarket findByProductType(String productType);
	
	public boolean upadatePriceByProductType(String productType, int price);
	
	public boolean deleteByProductsType(String productType);
}
