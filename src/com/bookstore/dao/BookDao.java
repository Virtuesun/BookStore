package com.bookstore.dao;


import com.bookstore.entity.Book;

public interface BookDao {
	Book getBookById(int id);
	int insert(Book book);
	int insertAndReturnId(Book book);
	//修改书籍
	int update(Book book);
	//删除书籍
	int delete(Book book);
	
	
}
