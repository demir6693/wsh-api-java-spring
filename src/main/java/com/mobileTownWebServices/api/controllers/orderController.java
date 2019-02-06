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

import com.mobileTownWebServices.api.model.order;
import com.mobileTownWebServices.api.repository.orderRepo;

@RestController
@RequestMapping("/api")
public class orderController {

	@Autowired
	orderRepo _orderRepo;
	
	@GetMapping("/order")
	public List<order> getAll()
	{
		return _orderRepo.findAll();
	}
	
	@GetMapping("/order/{id}")
	public order getOrder(@Valid @PathVariable int id)
	{
		Optional<order> order = _orderRepo.findById(id);
		
		return order.get();
	}
	
	@GetMapping("/order_bycart/{cart_id}")
	public List<order> getAllOrderByCartId(@Valid @PathVariable("cart_id") Integer cart_id)
	{
		return _orderRepo.findAllOrderByCartId(cart_id);
	}
	
	@GetMapping("/order_byuser/{user_id}")
	public List<order> getAllOrderByUserId(@Valid @PathVariable("user_id") Integer user_id)
	{
		return _orderRepo.findAllOrderByUserId(user_id);
	}
	
	@PostMapping("/order")
	public order createOrder(@Valid @RequestBody order order)
	{
		return _orderRepo.save(order);
	}
	
	@PutMapping("/order/{id}")
	public ResponseEntity<order> updateOrder(@RequestBody order order, @PathVariable int id)
	{
		Optional<order> OptOrder = _orderRepo.findById(id);
		
		if(!OptOrder.isPresent())
			return ResponseEntity.notFound().build();
		
		order.setId(id);
		
		_orderRepo.save(order);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/order/{id}")
	public void deleteOrder(@Valid @PathVariable int id)
	{
		_orderRepo.deleteById(id);
	}
}
