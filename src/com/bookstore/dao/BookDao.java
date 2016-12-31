package com.bookstore.dao;


import com.bookstore.entity.Book;

public interface BookDao {
	Book getBookById(int id);
	int insert(Book book);
}
