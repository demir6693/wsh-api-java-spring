package com.mobileTownWebServices.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "cart_items")
public class cart_items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private int product_id;
	
	private int cart_id;
	
	private Date date_added;
	
	private int quantity;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
