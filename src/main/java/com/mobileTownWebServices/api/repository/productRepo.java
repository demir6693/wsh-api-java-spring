package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileTownWebServices.api.model.product;

@Repository
public interface productRepo extends JpaRepository<product, Integer>{

}
