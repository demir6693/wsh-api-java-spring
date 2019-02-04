package com.mobileTownWebServices.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(length = 50)
	private String name;
	
	@Column(length = 50)
	private String l_name;
	
	@Column(length = 50)
	private String user_name;
	
	@Column(length = 50)
	private String email;
	
	@Column(length = 255)
	private String password;
	
	@Column(length = 50)
	private String phone_number;
	
	@Column(length = 50)
	private String city;
	
	private int city_postal_code;
	
	@Column(length = 50)
	private String street;

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

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCity_postal_code() {
		return city_postal_code;
	}

	public void setCity_postal_code(int city_postal_code) {
		this.city_postal_code = city_postal_code;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
