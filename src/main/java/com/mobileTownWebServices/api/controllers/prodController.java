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

import com.mobileTownWebServices.api.model.product;
import com.mobileTownWebServices.api.repository.productRepo;

@RestController
@RequestMapping("/api")
public class prodController {
	
	@Autowired
	productRepo _productRepo;
	
	@GetMapping("/products")
	public List<product> getall()
	{
		return _productRepo.findAll();
	}
	
	@GetMapping("/products/{id}")
	public product getproduct(@Valid @PathVariable int id)
	{
		Optional<product> product = _productRepo.findById(id);
		
		return product.get();
	}
	
	@PostMapping("/products")
	public product createProduct(@Valid @RequestBody product product)
	{
		return _productRepo.save(product);
	}

}
