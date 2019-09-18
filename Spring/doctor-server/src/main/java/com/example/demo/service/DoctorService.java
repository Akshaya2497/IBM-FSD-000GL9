package com.example.demo.service;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DoctorDto;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorService {
	private Environment env;
	private DoctorRepository repo;
	
	public DoctorService(Environment env, DoctorRepository repo) {
		super();
		this.env = env;
		this.repo = repo;
	}
	
	public DoctorDto showPatients(String disease) {
		
		
	}

}
