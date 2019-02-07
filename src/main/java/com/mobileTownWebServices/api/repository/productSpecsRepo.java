package com.mobileTownWebServices.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mobileTownWebServices.api.model.product_specs;

public interface productSpecsRepo extends JpaRepository<product_specs, Integer>{

	@Query(value = "SELECT * FROM product_specs WHERE product_id = ?1", nativeQuery = true)
	public List<product_specs> findAllByProductId(Integer product_id);
}
