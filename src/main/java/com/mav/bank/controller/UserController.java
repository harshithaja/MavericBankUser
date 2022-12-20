package com.mav.bank.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mav.bank.entity.User;
import com.mav.bank.service.UserService;
import com.mav.bank.userdto.UserDTO;



@RestController
public class UserController 
{
	
	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;
	
	
	@PostMapping("/users")
	public ResponseEntity<?> createUser(@RequestBody UserDTO userDto) {
		Map<String, Object> jsonResponseMap = new LinkedHashMap<String, Object>();
		User u = modelMapper.map(userDto, User.class);
		//lhs of user has been put show the response in postman (below code)
		User user_details=userService.addUser(u);
		jsonResponseMap.put("status", 1);
		jsonResponseMap.put("message", "User created Successfully!");
		return new ResponseEntity<>(user_details, HttpStatus.CREATED);

	}

}
