package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {

	public abstract User createUser(User user);
	public abstract List<User> readAllUser();
	public abstract User readByUserId(int userId);
	public abstract User readByUserName(String userName);
	public abstract User validateUserId(int userId, String password);
	public abstract User updateByUserId(int userId);
	public abstract User updateByUserName(String userName);
	public abstract User updateUser(User user);
	public abstract User deleteByUserId(int userId);
	public abstract User deleteByUserName(String userName);
}
