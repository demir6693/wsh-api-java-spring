package com.mobileTownWebServices.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "orders")
public class order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private int user_id;
	
	private int cart_id;
	
	private Date date_order;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public Date getDate_order() {
		return date_order;
	}

	public void setDate_order(Date date_order) {
		this.date_order = date_order;
	}

}
