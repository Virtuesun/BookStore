package com.bookstore.biz;

import com.bookstore.entity.User;

public interface UserBiz {
	//通过ID获取user
	User getUserById(int id);
	//通过用户名获取user
	User getUserByUserName(String username);
	//注册用户
	boolean register(User user);
	//修改用户
	boolean update(User user);

}
