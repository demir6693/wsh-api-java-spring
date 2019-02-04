package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileTownWebServices.api.model.product_group;

@Repository
public interface prodGroupRepo extends JpaRepository<product_group, Integer>{

}
