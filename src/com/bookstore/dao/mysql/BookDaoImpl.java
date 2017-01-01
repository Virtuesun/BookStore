package com.bookstore.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.bookstore.dao.BookDao;
import com.bookstore.dao.base.BaseDao;
import com.bookstore.dao.base.RSProcessor;
import com.bookstore.entity.Book;

public class BookDaoImpl extends BaseDao implements BookDao {

	@Override
	public Book getBookById(int id) {
		String sql = "select name, author,isbn,press,verson,pages,words,press_date,size,paper,categories from book where id = ?";

		RSProcessor bookRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Book book = null;
				if (rs.next()) {
					book = new Book();
					book.setId(id);
					book.setName(rs.getString("name"));
					book.setAuthor(rs.getString("author"));
					book.setIsbn(rs.getString("isbn"));
					book.setPress(rs.getString("press"));
					book.setVersion(rs.getString("version"));
					book.setPages(rs.getInt("pages"));
					book.setWords(rs.getInt("words"));
					book.setPress_date(rs.getString("press_date"));
					book.setSize(rs.getInt("size"));
					book.setPaper(rs.getString("paper"));
					book.setCategories("categories");
				}

				return book;
			}

		};

		return (Book) executeQuery(bookRS, sql, id);
	}

	@Override
	public int insert(Book book) {
		String sql = "insert into book (name, author,isbn,press,verson,pages,words,press_date,size,paper,categories) values(?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = { book.getName(), book.getAuthor(), book.getIsbn(), book.getPress(), book.getVersion(),
				book.getPages(), book.getWords(), book.getPress_date(), book.getSize(), book.getPaper(),
				book.getCategories() };
		return executeUpdate(sql, params);
	}

}
