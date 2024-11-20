package com.xworks.EnterpriceCrud.Repository;



import com.xworks.EnterpriceCrud.Entity.SuperMarket;

public class SuperMarketRepositoryImpl implements SuperMarketRepository{
	
	SuperMarket[] items = new SuperMarket[10];

	@Override
	public boolean saveSuperMarket(SuperMarket superMarket) {
		
		for (int i = 0; i < items.length; i++) {
			
			if (items[i] == null) {
				
				items[i] = superMarket;
				System.out.println("Data has been save");
				return true;
			}
			
		}
		System.err.println("There is no space available to store");
		return false;
	}

	@Override
	public SuperMarket[] readAll() {
	
		return items;
	}

}
