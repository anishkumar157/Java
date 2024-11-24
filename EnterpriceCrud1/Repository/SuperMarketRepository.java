package com.xworks.EnterpriceCrud.Repository;

import com.xworks.EnterpriceCrud.Entity.SuperMarket;

public interface SuperMarketRepository {
	
	public boolean saveSuperMarket(SuperMarket superMarket);
	
	public SuperMarket[] readAll();
	public SuperMarket findByProductName (String productName);
	public boolean updatePriceByProductName(String productName ,int price);
	public boolean deleteByProductName(String productName);
	public SuperMarket findByProductType(String productType);
	public boolean upadatePriceByProductType(String productType, int price);
	public boolean deleteByProductsType(String productType);

}
