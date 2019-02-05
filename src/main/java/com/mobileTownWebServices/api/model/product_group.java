package com.mobileTownWebServices.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.*;

@Entity
@Table(name = "product_group")
public class product_group {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(length = 100)
	private String Name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
