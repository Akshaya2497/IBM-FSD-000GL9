package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.data.User;
import com.example.demo.dto.UserDto;


@Service
public class UserServiceImpl implements UserService {
	private Environment env;
	private UserRepository userRepo;

	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	public UserServiceImpl(Environment env, UserRepository userRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.env = env;
		this.userRepo = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public UserDto createUser(UserDto userDetail) {
		// TODO Auto-generated method stub
		userDetail.setUserId(UUID.randomUUID().toString());
		String bPass=bCryptPasswordEncoder.encode(userDetail.getPassword());
		userDetail.setBcrypetedPassword(bCryptPasswordEncoder.encode(userDetail.getPassword()));
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		User user=mapper.map(userDetail, User.class);
		user.setPassword(userDetail.getBcrypetedPassword());
		userRepo.save(user);
		UserDto uDto=mapper.map(user, UserDto.class);
		
		return uDto;
	}
	@Override
	public List<User> getAllUsers() {
	
		return (List<User>) userRepo.findAll();
	}

	@Override
	public List<User> findById(String id) {
		return userRepo.findAllById(id);
		
	}
	
	


}

