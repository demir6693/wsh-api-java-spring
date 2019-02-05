package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileTownWebServices.api.model.order;

public interface orderRepo extends JpaRepository<order, Integer>{

}
