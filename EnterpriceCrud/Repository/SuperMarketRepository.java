package com.xworks.EnterpriceCrud.Repository;

import com.xworks.EnterpriceCrud.Entity.SuperMarket;

public interface SuperMarketRepository {
	
	public boolean saveSuperMarket(SuperMarket superMarket);
	
	public SuperMarket[] readAll();

}
