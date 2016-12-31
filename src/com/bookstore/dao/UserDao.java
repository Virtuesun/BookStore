package com.bookstore.dao;

import com.bookstore.entity.User;

public interface UserDao {
	User getUserById(int id);
	User getUserByUserName(String username);
	int insert(User user);
	int update(User user);

}
