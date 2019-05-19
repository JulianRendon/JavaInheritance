package com.julianrendon.javainheritance;

public class Product {

	// Attributes
	private String code;
	private String description;
	private double price;
	protected static int count = 0; // a protected static variable

	// Methods
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}

	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public Product() {
		code = "";
		description = "";
		price = 0;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}	

}
