package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileTownWebServices.api.model.cart;

public interface cartRepo extends JpaRepository<cart, Integer>{
	
	public cart findByUserId(int user_id);
}
