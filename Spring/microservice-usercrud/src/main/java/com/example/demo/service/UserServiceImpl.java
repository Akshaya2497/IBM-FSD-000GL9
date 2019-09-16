package com.example.demo.service;

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
	private UserRepository userRepository;

	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	public UserServiceImpl(Environment env, UserRepository userRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.env = env;
		this.userRepository = userRepository;
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
		userRepository.save(user);
		UserDto uDto=mapper.map(user, UserDto.class);
		
		return uDto;
	}



}

