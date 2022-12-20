package com.mav.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mav.bank.dao.UserRepository;
import com.mav.bank.entity.User;


@Component
public class UserService 
{
	
private static final String USERNOTFOUND = "User not in system";

	
	@Autowired
	private UserRepository userRepository;
	
	// Adding user
		public User addUser(User user) 
		{
			User result = userRepository.save(user);
			return result;
		}

}
