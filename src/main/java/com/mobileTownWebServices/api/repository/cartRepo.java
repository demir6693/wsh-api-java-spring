package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mobileTownWebServices.api.model.cart;

public interface cartRepo extends JpaRepository<cart, Integer>{
	
	@Query(value = "SELECT * FROM cart WHERE user_id = ?1", nativeQuery = true)
	public cart findByUserId(Integer user_id);
}
