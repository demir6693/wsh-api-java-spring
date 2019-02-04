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

import com.mobileTownWebServices.api.model.user;
import com.mobileTownWebServices.api.repository.userRepo;

@RestController
@RequestMapping("/api")
public class userController {

	@Autowired
	userRepo _userRepo;
	
	@GetMapping("/users")
	public List<user> getAll()
	{
		return _userRepo.findAll();
	}
	
	@GetMapping("/users/{id}")
	public user getUser(@Valid @PathVariable int id)
	{
		Optional<user> user = _userRepo.findById(id);
		
		return user.get();
	}
	
	@PostMapping("/users")
	public user createUser(@Valid @RequestBody user user)
	{
		return _userRepo.save(user);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<user> updateUser(@RequestBody user user, @PathVariable int id)
	{
		Optional<user> optionalUser = _userRepo.findById(id);
		
		if(!optionalUser.isPresent())
			return ResponseEntity.notFound().build();
		
		user.setId(id);
		
		_userRepo.save(user);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		_userRepo.deleteById(id);
	}
}
