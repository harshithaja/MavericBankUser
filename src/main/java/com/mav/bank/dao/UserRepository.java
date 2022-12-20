package com.mav.bank.dao;

import org.springframework.data.repository.CrudRepository;

import com.mav.bank.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>
{

}
