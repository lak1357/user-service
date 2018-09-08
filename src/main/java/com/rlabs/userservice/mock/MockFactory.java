package com.rlabs.userservice.mock;

import java.util.ArrayList;
import java.util.List;

import com.rlabs.userservice.model.User;

public class MockFactory {

	public static List<User> getMockUsers() {

		List<User> mockList = new ArrayList<>();
		mockList.add(new User(1, "Lakshitha", "Herath"));
		mockList.add(new User(2, "Mark", "Anderson"));
		mockList.add(new User(3, "Jhon", "Smith"));
		mockList.add(new User(4, "New", "User"));

		return mockList;
	}

}
