package com.example.demo.service;

import java.util.List;

import com.example.demo.data.User;
import com.example.demo.dto.UserDto;

public interface UserService {
	public UserDto createUser(UserDto userDetail);

	public List<User> getAllUsers();

	public List<User> findById(String id);

	
}
