package com.xworks.EnterpriceCrud.Entity;

public class SuperMarket {
	
	private String productName;
	private String productType;
	private int productPrice;
	private int discount;
	private int quantity;
	
	
	public SuperMarket(String productName, String productType, int productPrice, int discount, int quantity) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		this.discount = discount;
		this.quantity = quantity;
	}	
	
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int expeiryDate) {
		this.quantity = expeiryDate;
	}
	
	
	public void printDetails() {
		
		System.out.println("--------------------------------------");
		System.out.println("Product Name : "+productName);
		System.out.println("Product Type : "+productType);
		System.out.println("Product Prize : "+productPrice);
		System.out.println("Discount : "+discount);
		System.out.println("Quantity : "+quantity);
	}
}


