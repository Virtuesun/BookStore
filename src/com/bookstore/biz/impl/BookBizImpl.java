package com.bookstore.biz.impl;

import java.lang.reflect.InvocationTargetException;

import com.bookstore.biz.BookBiz;
import com.bookstore.biz.util.BizUtil;
import com.bookstore.dao.BookDao;
import com.bookstore.entity.Book;

public class BookBizImpl implements BookBiz {

	@Override
	public Book getBookById(int id) {
		BookDao bookDao = null;
		Book book = null;
		try {
			bookDao = (BookDao) BizUtil.getDialectedDao(BookDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (bookDao != null) {
			book = bookDao.getBookById(id);
		}
		return book;
	}

	@Override
	public boolean insert(Book book) {
		BookDao bookDao = null;
		boolean success = false;
		try {
			bookDao = (BookDao) BizUtil.getDialectedDao(BookDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (bookDao != null) {
			int result = bookDao.insert(book);
			if (result == 1) {
				success = true;
			}
		}
		return success;
	}

	@Override
	public int insertAndReturnId(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

}
