package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserId(String id);
}
