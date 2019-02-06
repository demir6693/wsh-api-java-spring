package com.mobileTownWebServices.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobileTownWebServices.api.model.cart_items;
import com.mobileTownWebServices.api.repository.cartItemRepo;

@RestController
@RequestMapping("/api")
public class cartItemController {

	@Autowired
	cartItemRepo _cartItemRepo;
	
	@GetMapping("cart_item")
	public List<cart_items> getAll()
	{
		return _cartItemRepo.findAll();
	}
	
	@GetMapping("/cart_item/{id}")
	public cart_items getCartItems(@Valid @PathVariable int id)
	{
		Optional<cart_items> cartItems = _cartItemRepo.findById(id);

		return cartItems.get();
	}
	
	@GetMapping("/cart_items_cart_id/{cart_id}")
	public List<cart_items> getCartItemsByCartId(@Valid @PathVariable("cart_id") Integer cart_id)
	{
		return _cartItemRepo.findCartItemsByCartId(cart_id);
	}
	
	@PostMapping("cart_item")
	public cart_items createCartItem(@Valid @RequestBody cart_items cartItem)
	{
		return _cartItemRepo.save(cartItem);
	}
	
	@PutMapping("/cart_item/{id}")
	public ResponseEntity<cart_items> updateCartItem(@RequestBody cart_items cartItem, @PathVariable int id)
	{
		Optional<cart_items> optCartItem = _cartItemRepo.findById(id);
		
		if(!optCartItem.isPresent())
			return ResponseEntity.notFound().build();
		
		cartItem.setId(id);
		
		_cartItemRepo.save(cartItem);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/cart_item/{id}")
	public void deleteCartItem(@Valid @PathVariable int id)
	{
		_cartItemRepo.deleteById(id);
	}
}
