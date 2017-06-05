package com.student.dao;

import java.util.Map;

import com.student.entity.User;

public interface UserDao {
	
	public User login(User user);
	
	public int insertUser(User user);
	
	public User findUser(Map<String,Object> map);
	
	public int updateUser(Map<String,Object> map);
	
}
