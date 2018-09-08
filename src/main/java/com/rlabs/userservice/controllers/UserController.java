package com.rlabs.userservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlabs.userservice.mock.MockFactory;
import com.rlabs.userservice.model.User;

@RestController
public class UserController {

	@RequestMapping("/users")
	public List<User> getUsers() {

		return MockFactory.getMockUsers();

	}

}
