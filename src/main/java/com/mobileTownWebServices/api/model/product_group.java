package com.mobileTownWebServices.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "product_group")
public class product_group {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(length = 100)
	private String Name;
 /*
	@OneToMany(mappedBy = "groupProd", cascade = CascadeType.ALL)
	private Set<product> product; */
	
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
