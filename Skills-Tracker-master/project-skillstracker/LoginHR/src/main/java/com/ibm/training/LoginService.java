package com.ibm.training;

import java.io.Console;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

@Service
public class LoginService 
{
	@Autowired
	LoginRepo repo;
	
//	@Autowired
//	private Environment env;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	public LoginService(LoginRepo repo, BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.repo = repo;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
//	@Override
//	public HrDto createUser(HrDto userDetails) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		
//		if(userDetails.getPassword().equals(userDetails.getMatchingPassword())) {
//			System.out.println("user's password matched");
//			String email= userDetails.getEmail();
//			User userAlreadyExists = userRepo.findByEmail(email);
//			if(userAlreadyExists==null) {
//		userDetails.setUserId(UserServiceImpl.generateRandomString());
//		User user = mapper.map(userDetails, User.class);
//		//becryptpassword
//		String bpass=bCryptPasswordEncoder.encode(user.getPassword());
//		user.setPassword(bpass);
//		HrDto userDto = mapper.map(user, HrDto.class);
//		userRepo.save(user);
//		return userDto;
//			}
//	   }
//		System.out.println("user already exist.!");
//		return null;
//	}
	



//verifying the user
//@Override

public HR verifyUser(String email, String pass ) {
	//ModelMapper mapper = new ModelMapper();
	//mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	
	HR hr = repo.findByUseremail(email);
	//User user = userRepo.findByEmail(email);
	if(hr!=null) {
	 //  UserDto userdto = mapper.map(user, UserDto.class);	
		    if(hr.getUseremail().equals(email) && bCryptPasswordEncoder.matches(pass, hr.getUserpassword()))
		    {
			return hr;
		    }
		  else
		  {
			return null;
		  }
		}
	else {
		return null;
		}
}
	
//	public String verifyUser(HR hr) {
//
//		String email = hr.getUseremail();
//		String password = hr.getUserpassword();
//		HR hr1 = repo.findByUseremail(email);
//			if (hr1.getUseremail().equals(email) && bCryptPasswordEncoder.matches(password, hr1.getUserpassword())) {
//				System.out.println(password);
//				return "found";
//			}
//			else {
//			return "not found";
//			}
//	}

	public Iterable<HR> getAllHR() 
	{
		return repo.findAll();
	}

	public void updateHR(HR hr) {
	    String bpass = bCryptPasswordEncoder.encode(hr.getUserpassword());
		hr.setBcryptPass(bpass);
		System.out.println(hr.getBcryptPass());
    	repo.save(hr);
	}


	public HR getByName(String name) {
		// TODO Auto-generated method stub
		
		return repo.findByUseremail(name);
	}

	
	
}
