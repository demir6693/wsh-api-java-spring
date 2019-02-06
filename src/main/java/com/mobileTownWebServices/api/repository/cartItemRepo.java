package com.mobileTownWebServices.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mobileTownWebServices.api.model.cart_items;

public interface cartItemRepo extends JpaRepository<cart_items, Integer> {

	@Query(value = "SELECT * FROM cart_items WHERE cart_id = ?1", nativeQuery = true)
	public List<cart_items> findCartItemsByCartId(Integer cart_id);
}
