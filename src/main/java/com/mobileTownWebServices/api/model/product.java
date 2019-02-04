package com.mobileTownWebServices.api.model;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	/*
	@ManyToOne
	@JoinColumn
	private product_group groupProd; */
	
	@Column(length = 255)
	private String name;
	
	@Column(length = 65000)
	private String picture;
	
	private BigDecimal msrp_price;
	
	private BigDecimal price;
	
	@Column(length = 5120)
	private String description;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
/*
	public product_group getGroup() {
		return groupProd;
	}

	public void setGroup(product_group groupProd) {
		this.groupProd = groupProd;
	} */

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

	
}