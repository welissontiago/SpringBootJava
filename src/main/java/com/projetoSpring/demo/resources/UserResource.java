package com.projetoSpring.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpring.demo.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Uelisson", "Uelisson@gmail.com", "7199999999", "ueli@123");
		return ResponseEntity.ok().body(u);
	}

}
