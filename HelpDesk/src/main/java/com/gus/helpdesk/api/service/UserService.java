package com.gus.helpdesk.api.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.gus.helpdesk.api.entity.User;

public interface UserService {
	
	User findbyEmail(String email);
	
	User createOrUpdate(User user);
	
	Optional<User> findById(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);

}
