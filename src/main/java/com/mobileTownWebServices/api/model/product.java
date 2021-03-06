package com.mobileTownWebServices.api.model;

import java.math.BigDecimal;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(length = 255)
	private String name;
	
	@Column(length = 2)
	private String picture;
	
	private BigDecimal msrp_price;
	
	private BigDecimal price;
	
	@Column(length = 5120)
	private String description;
	
	@Column(nullable = true)
	private int group_id;
	
	@Column(nullable = true)
	private int brand_id;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public BigDecimal getMsrp_price() {
		return msrp_price;
	}

	public void setMsrp_price(BigDecimal msrp_price) {
		this.msrp_price = msrp_price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	
}
