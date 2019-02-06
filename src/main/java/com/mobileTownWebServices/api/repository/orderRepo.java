package com.mobileTownWebServices.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mobileTownWebServices.api.model.order;

public interface orderRepo extends JpaRepository<order, Integer>{

	@Query(value = "SELECT * FROM orders WHERE user_id = ?1", nativeQuery = true)
	public List<order> findAllOrderByUserId(Integer user_id);
	
	@Query(value = "SELECT * FROM orders WHERE cart_id = ?1", nativeQuery = true)
	public List<order> findAllOrderByCartId(Integer cart_id);
}
