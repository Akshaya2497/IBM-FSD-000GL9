package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LeagueRepository;
import com.example.demo.dto.LeagueDto;
import com.example.demo.entity.League;
@Service
public class LeagueService {
	LeagueRepository leagueRepo;
	public List<League> getAllLeague() {
		return (List<League>) leagueRepo.findAll();
		
	}
	public LeagueDto createUser(LeagueDto userDetail) {
		// TODO Auto-generated method stub
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		League leagueEntity=mapper.map(userDetail, League.class);
		
		leagueRepo.save(leagueEntity);
		LeagueDto uDto=mapper.map(leagueEntity, LeagueDto.class);
		
		return uDto;
	}
	public League deleteLeague(String leagueID) {
		League league= leagueRepo.findByLeagueId(leagueID);
		leagueRepo.delete(league);
		return league;
		}

}
