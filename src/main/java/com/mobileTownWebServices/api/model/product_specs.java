package com.mobileTownWebServices.api.model;

public class product_specs {

	private int Id;
	
	private int Id_product;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getId_product() {
		return Id_product;
	}

	public void setId_product(int id_product) {
		Id_product = id_product;
	}

	public product getProduct() {
		return product;
	}

	public void setProduct(product product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	private product product;
	
	private String name;
	
	private String specs;
}
