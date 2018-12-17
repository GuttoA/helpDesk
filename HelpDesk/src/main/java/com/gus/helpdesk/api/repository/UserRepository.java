package com.gus.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gus.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByEmail(String email);

}
