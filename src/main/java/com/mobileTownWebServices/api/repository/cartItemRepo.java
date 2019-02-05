package com.mobileTownWebServices.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileTownWebServices.api.model.cart_items;

public interface cartItemRepo extends JpaRepository<cart_items, Integer> {

}
