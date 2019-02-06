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

import com.mobileTownWebServices.api.model.brand;
import com.mobileTownWebServices.api.repository.brandRepo;

@RestController
@RequestMapping("/api")
public class brandController {

	@Autowired
	brandRepo _brandRepo;
	
	@GetMapping("/brand")
	public List<brand> getAll()
	{
		return _brandRepo.findAll();
	}
	
	@GetMapping("/brand/{id}")
	public brand getBrand(@Valid @PathVariable int id)
	{
		Optional<brand> brand = _brandRepo.findById(id);
		
		return brand.get();
	}
	
	@PostMapping("/brand")
	public brand createBrand(@Valid @RequestBody brand brand)
	{
		return _brandRepo.save(brand);
	}
	
	@PutMapping("/brand/{id}")
	public ResponseEntity<brand> updateBrand(@RequestBody brand brand, @PathVariable int id)
	{
		Optional<brand> OptBrand = _brandRepo.findById(id);
		
		if(!OptBrand.isPresent())
			return ResponseEntity.notFound().build();
		
		brand.setId(id);
		
		_brandRepo.save(brand);
		
		return ResponseEntity.ok(brand);
	}
	
	@DeleteMapping("/brand/{id}")
	public void deleteBrand(@Valid @PathVariable int id)
	{
		_brandRepo.deleteById(id);
	}
}
