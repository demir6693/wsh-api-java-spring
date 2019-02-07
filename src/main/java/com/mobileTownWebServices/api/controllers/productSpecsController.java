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

import com.mobileTownWebServices.api.model.product_specs;
import com.mobileTownWebServices.api.repository.productSpecsRepo;

@RestController
@RequestMapping("/api")
public class productSpecsController {

	@Autowired
	productSpecsRepo _productSpecsRepo;
	
	@GetMapping("/productspecs")
	public List<product_specs> getAll()
	{
		return _productSpecsRepo.findAll();
	}
	
	@GetMapping("/productspecs/{id}")
	public product_specs getProdSpecs(@Valid @PathVariable int id)
	{
		Optional<product_specs> productSpecs = _productSpecsRepo.findById(id);
		
		return productSpecs.get();
	}
	
	@GetMapping("/getprodspecs/{product_id}")
	public List<product_specs> getAllByProductId(@Valid @PathVariable("product_id") Integer product_id)
	{
		return _productSpecsRepo.findAllByProductId(product_id);
	}
	
	@PostMapping("/productspecs")
	public product_specs createSpecs(@Valid @RequestBody product_specs productSpecs)
	{
		return _productSpecsRepo.save(productSpecs);
	}
	
	@PutMapping("/productspecs/{id}")
	public ResponseEntity<product_specs> updateProdSpecs(@RequestBody product_specs productSpecs, @PathVariable int id)
	{
		Optional<product_specs> OptProdSpces = _productSpecsRepo.findById(id);
		
		if(!OptProdSpces.isPresent())
			return ResponseEntity.notFound().build();
		
		productSpecs.setId(id);
		
		_productSpecsRepo.save(productSpecs);
		
		return ResponseEntity.ok(productSpecs);
	}
	
	@DeleteMapping("/productspecs/{id}")
	public void deleteProductSpecs(@Valid @PathVariable int id)
	{
		_productSpecsRepo.deleteById(id);
	}
}
