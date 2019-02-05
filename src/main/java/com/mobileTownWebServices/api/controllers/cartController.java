package com.mobileTownWebServices.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileTownWebServices.api.model.cart;
import com.mobileTownWebServices.api.repository.cartRepo;

@RestController
@RequestMapping("/api")
public class cartController {

	@Autowired
	cartRepo _cartRepo;
	
	@GetMapping("/cart")
	public List<cart> getAll()
	{
		return _cartRepo.findAll();
	}
	
	@GetMapping("/cart/{id}")
	public cart getCart(@Valid @PathVariable int id)
	{
		Optional<cart> cart = _cartRepo.findById(id);
		
		return cart.get();
	}
	/*
	@GetMapping("/cartuser/{user_id}")
	public cart getCartofUser(@Valid @PathVariable int user_id)
	{
		cart cart = _cartRepo.findByUserId(user_id);
		
		return cart;
	}  */

	@PostMapping("/cart")
	public cart createCart(@Valid @RequestBody cart cart)
	{
		return _cartRepo.save(cart);
	}
}
