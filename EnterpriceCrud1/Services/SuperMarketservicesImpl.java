package com.xworks.EnterpriceCrud.Services;

import com.xworks.EnterpriceCrud.Entity.SuperMarket;
import com.xworks.EnterpriceCrud.Repository.SuperMarketRepository;
import com.xworks.EnterpriceCrud.Repository.SuperMarketRepositoryImpl;
public class SuperMarketservicesImpl implements SuperMarketServices{
	
	SuperMarketRepository repo = new SuperMarketRepositoryImpl();

	@Override
	public boolean validateSuperMarket(SuperMarket superMarket) {
		
		if (superMarket != null ) {
			
			if (superMarket.getProductName() != null && superMarket.getProductName().length() > 3) {
				
				if (superMarket.getProductType() != null && superMarket.getProductType().length() > 3) {
					
					if (superMarket.getProductPrice() > 50) {
						
						if (superMarket.getDiscount() < 10 && superMarket.getDiscount() >= 0) {
							
							if (superMarket.getQuantity() > 0) {
								
								System.out.println("Validation Successfull. No Error!!");
								
								return repo.saveSuperMarket(superMarket);								
							}
							
							System.err.println("Quantity should be minimum 1 !!");
							return false;
						}
						
						System.err.println("Discount should be in between 0 and 10!!");
						return false;						
					}
					
					System.err.println("Product Price should be Greater than 50!!");
					return false;					
				}
				
				System.err.println("Product Type should Contain minimum 3 charecters!!");
				return false;				
			}
			
			System.err.println("Product Name Contain Minimum 3 Charecters!!");
			return false;
			
		}
		
		System.err.println("Values Cannot be Null");
		return false;
	}

	@Override
	public SuperMarket[] readAll() {
		
		return repo.readAll();
	}

	@Override
	public SuperMarket findByProductName(String productName) {
		
		if(productName !=null && !productName.isEmpty()) {
			
			System.out.println("Input is Valid");
			return repo.findByProductName(productName);
			
		}
		
		System.out.println("Input is Not Valid");
		return null;
		
	}

	@Override
	public boolean upadatePriceByName(String productName, int price) {
		if(productName !=null && !productName.isEmpty()) {
			if(price>50) {
				return repo.updatePriceByProductName(productName,price);
			}
		}
		System.err.println("ivalid input");
		return false;
	}


	@Override
	public boolean deleteByProductsName(String productName) {
		if(productName !=null && !productName.isEmpty()) {
			System.out.println("validation succsess");
			return repo.deleteByProductName(productName);
		}
		System.err.println("invalid input");
		return false;
	}

	@Override
	public SuperMarket findByProductType(String productType) {
		if(productType !=null && !productType.isEmpty()) {
			
			System.out.println("Input is Valid");
			return repo.findByProductType(productType);
			
		}
		
		System.out.println("Input is Not Valid");
		return null;
	}

	@Override
	public boolean upadatePriceByProductType(String productType, int price) {
		
		if(productType !=null && !productType.isEmpty()) {
			if(price>50) {
				return repo.upadatePriceByProductType( productType,  price);
			}
		}
		System.err.println("ivalid input");
		return false;
		
		
	}

	@Override
	public boolean deleteByProductsType(String productType) {
		if(productType !=null && !productType.isEmpty()) {
			System.out.println("validation succsess");
			return repo.deleteByProductsType(productType);
		}
		System.err.println("invalid input");
		return false;
	}
}




