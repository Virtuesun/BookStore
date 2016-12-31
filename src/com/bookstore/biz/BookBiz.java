package com.bookstore.biz;

import com.bookstore.entity.Book;

public interface BookBiz {
	//通过id获取书籍
	Book getBookById(int id);
	//插入书籍
	boolean insert(Book book);
	//插入书籍，返回自动增长的id
	int insertAndReturnId(Book book);
	//修改书籍
	boolean update(Book book);
	//删除书籍
	boolean delete(Book book);

}
