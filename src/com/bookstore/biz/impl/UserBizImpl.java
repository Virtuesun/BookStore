package com.bookstore.biz.impl;

import java.lang.reflect.InvocationTargetException;

import com.bookstore.biz.UserBiz;
import com.bookstore.biz.util.BizUtil;
import com.bookstore.dao.UserDao;
import com.bookstore.entity.User;

public class UserBizImpl implements UserBiz {

	@Override
	public User getUserById(int id) {
		UserDao userDao = null;
		User user = null;
		try {
			userDao = (UserDao) BizUtil.getDialectedDao(UserDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (userDao != null) {
			user = userDao.getUserById(id);
		}
		return user;
	}

	@Override
	public User getUserByUserName(String username) {
		UserDao userDao = null;
		User user = null;
		try {
			userDao = (UserDao) BizUtil.getDialectedDao(UserDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (userDao != null) {
			user = userDao.getUserByUserName(username);
		}
		return user;
	}

	@Override
	public boolean register(User user) {
		UserDao userDao = null;
		boolean success = false;
		try {
			userDao = (UserDao) BizUtil.getDialectedDao(UserDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (userDao != null) {
			int result = userDao.insert(user);
			if (result == 1) {
				success = true;
			}
		}
		return success;
	}

	@Override
	public boolean update(User user) {
		UserDao userDao = null;
		boolean success = false;
		try {
			userDao = (UserDao) BizUtil.getDialectedDao(UserDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (userDao != null) {
			int result = userDao.update(user);
			if (result == 1) {
				success = true;
			}
		}
		return success;
	}

}
