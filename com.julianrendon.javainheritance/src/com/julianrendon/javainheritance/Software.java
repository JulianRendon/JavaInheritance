package com.julianrendon.javainheritance;

public class Software extends Product{

	private String version;

	public Software(String code, String description, double price, String version) {
		super(code, description, price);
		this.version = version;
	}

	public Software() {
        super(); // call constructor of Product superclass
        version = "";
    }

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
