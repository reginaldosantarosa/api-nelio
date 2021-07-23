package com.example.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.models.User;

@RestController
@RequestMapping(value="/users")
public class Usercontroller {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u =  new User(1L,"jose","maria@gaml","99999","123456");
		return ResponseEntity.ok().body(u);
	}

}
