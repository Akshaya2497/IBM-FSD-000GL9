package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.League;
@Repository
public interface LeagueRepository extends CrudRepository<League, Long>  {
	League findByLeagueId(String id);
}
