package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LeagueDto;
import com.example.demo.entity.League;

import com.example.demo.model.LeagueRequestModel;
import com.example.demo.model.LeagueResponseModel;
import com.example.demo.service.LeagueService;

@RestController
@RequestMapping("/league")
public class LeagueController {
	@Autowired
	LeagueService service;
	
	@GetMapping("/leagues")
	public List<ResponseEntity<LeagueResponseModel>> fetchLeague(){
		List<League> league = service.getAllLeague();
		List<ResponseEntity<LeagueResponseModel>> list = new ArrayList<ResponseEntity<LeagueResponseModel>>();
		ModelMapper mapper = new ModelMapper();
		for(League l : league) {
			LeagueResponseModel res = mapper.map(l, LeagueResponseModel.class);
			list.add(ResponseEntity.status(HttpStatus.CREATED).body(res));
		}
		return list;
	}
	
	@PostMapping("/leagues")
	public ResponseEntity<LeagueResponseModel> create(@RequestBody LeagueRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		LeagueDto uDto=mapper.map(userDetail, LeagueDto.class);
		
		LeagueDto tempDto=service.createUser(uDto);
		LeagueResponseModel model=mapper.map(tempDto, LeagueResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	@DeleteMapping("/leagues/{id}")
	public ResponseEntity<LeagueResponseModel> deleteUser(@PathVariable("id") String leagueID){
		ModelMapper mapper = new ModelMapper();
		League league = service.deleteLeague(leagueID);
		LeagueResponseModel model = mapper.map(league, LeagueResponseModel.class);
		return ResponseEntity.status(HttpStatus.GONE).body(model);	
	}
	
	

}
