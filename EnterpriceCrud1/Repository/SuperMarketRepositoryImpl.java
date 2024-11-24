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

	@Override
	public SuperMarket findByProductName(String productName) {
		
		for (int i = 0; i < items.length; i++) {
			
			if(items[i]!=null) {
				if(items[i].getProductName().equals(productName)) {
					System.out.println("Product is Found");
					return items[i];
				}
			}
			
		}
		System.err.println("Product Not Found");
		return null;
	}

	@Override
	public boolean updatePriceByProductName(String productName, int price) {
		
		for (int i = 0; i < items.length; i++) {
			
			if(items[i]!=null) {
			
				if(items[i].getProductName().equals(productName)) {
					items[i].setProductPrice(price);
					System.out.println("Value Updated successfully");
					return true;
				}
			}
		}
		System.err.println("Data has not found");		
		return false;
	}

	@Override
	public boolean deleteByProductName(String productName) {
		
		for (int i = 0; i < items.length; i++) {
			
			if (items[i] != null) {
				
				if (items[i].getProductName().equals(productName)) {
					items[i] = null;
					System.out.println("Data has deleted");
					return true;
				}
				
			}
			
		}
		System.err.println("data is not found");
		return false;
	}

	@Override
	public SuperMarket findByProductType(String productType) {
		for (int i = 0; i < items.length; i++) {
			
			if(items[i]!=null) {
				if(items[i].getProductType().equals(productType)) {
					System.out.println("Product is Found");
					return items[i];
				}
			}
			
		}
		System.err.println("Product Not Found");
		return null;
	}

	@Override
	public boolean upadatePriceByProductType(String productType, int price) {
for (int i = 0; i < items.length; i++) {
			
			if(items[i]!=null) {
			
				if(items[i].getProductName().equals(productType)) {
					items[i].setProductPrice(price);
					System.out.println("Value Updated successfully");
					return true;
				}
			}
		}
		System.err.println("Data has not found");		
		return false;
	}

	@Override
	public boolean deleteByProductsType(String productType) {
		for (int i = 0; i < items.length; i++) {
			
			if (items[i] != null) {
				
				if (items[i].getProductType().equals(productType)) {
					items[i] = null;
					System.out.println("Data has deleted");
					return true;
				}
				
			}
			
		}
		System.err.println("data is not found");
		return false;
	}

}
