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
		BookDao bookDao = null;
		int result =  0 ;
		try {
			bookDao = (BookDao) BizUtil.getDialectedDao(BookDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (bookDao != null) {
			 result = bookDao.insertAndReturnId(book);
			
		}
		return result;

	}

	@Override
	public boolean update(Book book) {
		int influences = 0;
		BookDao bookDao = null;
		boolean result = false;
		try {
			bookDao = (BookDao) BizUtil.getDialectedDao(BookDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (bookDao != null) {
			 influences = bookDao.update(book);
			
		}
		if (influences > 0) {
			result = true;
		}
		return result;
	}

	@Override
	public boolean delete(Book book) {

		int influences = 0;
		BookDao bookDao = null;
		boolean result = false;
		try {
			bookDao = (BookDao) BizUtil.getDialectedDao(BookDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (bookDao != null) {
			 influences = bookDao.delete(book);
			
		}
		if (influences > 0) {
			result = true;
		}
		return result;

	}

}
