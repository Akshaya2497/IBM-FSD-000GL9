package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.User;
import com.example.demo.dto.UserDto;
import com.example.demo.model.CreateUserRequestModel;
import com.example.demo.model.CreateUserResponseModel;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/users")
	public ResponseEntity<CreateUserResponseModel> create(@RequestBody CreateUserRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto uDto=mapper.map(userDetail, UserDto.class);
		
		UserDto tempDto=service.createUser(uDto);
		CreateUserResponseModel model=mapper.map(tempDto, CreateUserResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	@GetMapping("/users")
	public List<ResponseEntity<CreateUserResponseModel>> getAllUsers(){
		List<User> users =  service.getAllUsers();
		List<ResponseEntity<CreateUserResponseModel>> list = new ArrayList<ResponseEntity<CreateUserResponseModel>>();
		ModelMapper mapper = new ModelMapper();
		for(User u : users) {
			CreateUserResponseModel res = mapper.map(u, CreateUserResponseModel.class);
			list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
		}
		
		return list;		
		
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<CreateUserResponseModel> findUser(@PathVariable String id){
		List<User> user =  service.findById(id);
		ModelMapper mapper = new ModelMapper();
		CreateUserResponseModel res = mapper.map(user, CreateUserResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(res);
		
		
		
	}

}
