package com.demo.crudoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crudoperation.entity.User;
import com.demo.crudoperation.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/create")
	public User createEmployee(@Validated @RequestBody User user) {
		return userRepository.save(user);
	}
}
