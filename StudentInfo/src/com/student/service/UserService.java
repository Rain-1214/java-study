package com.student.service;

import com.student.entity.User;

public interface UserService {
	
	public int insertUser(User user);
	
	public User findUser(User user);
	
	public int updateUser(User user);
	
	
	
}
