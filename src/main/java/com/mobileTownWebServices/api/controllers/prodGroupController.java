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

import com.mobileTownWebServices.api.model.product_group;
import com.mobileTownWebServices.api.repository.prodGroupRepo;

@RestController
@RequestMapping("/api")
public class prodGroupController {

	@Autowired
	prodGroupRepo _prodGroupRepo;
	
	@GetMapping("/prod_group")
	public List<product_group> getAll()
	{
		return _prodGroupRepo.findAll();
	}
	
	@GetMapping("/prod_group/{id}")
	public product_group getProdGroup(@Valid @PathVariable int id)
	{
		Optional<product_group> prodGroup = _prodGroupRepo.findById(id);
		
		return prodGroup.get();
	}
	
	@PostMapping("/prod_group")
	public product_group createProdGroup(@Valid @RequestBody product_group prodGroup)
	{
		return _prodGroupRepo.save(prodGroup);
	}
	
	@PutMapping("/prod_group/{id}")
	public ResponseEntity<product_group> updateGroup(@RequestBody product_group prodGroup, @PathVariable int id)
	{
		Optional<product_group> optionalProdGroup = _prodGroupRepo.findById(id);
		
		if(!optionalProdGroup.isPresent())
			ResponseEntity.notFound().build();
		
		prodGroup.setId(id);
		
		_prodGroupRepo.save(prodGroup);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/prod_group/{id}")
	public void deleteProdGroup(@Valid @PathVariable int id)
	{
		_prodGroupRepo.deleteById(id);
	}
}
