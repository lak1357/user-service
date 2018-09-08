package com.rlabs.userservice.mock;

import java.util.ArrayList;
import java.util.List;

import com.rlabs.userservice.model.User;

public class MockFactory {

	public static List<User> getMockUsers() {

		List<User> mockList = new ArrayList<>();
		mockList.add(new User(1, "Lakshitha", "Herath"));
		mockList.add(new User(1, "Mark", "Anderson"));
		mockList.add(new User(1, "Jhon", "Smith"));

		return mockList;
	}

}
