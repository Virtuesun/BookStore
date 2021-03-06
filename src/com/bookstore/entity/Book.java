package com.bookstore.entity;

public class Book {
	private int id; // 图书id
	private String name; // 图书名字
	private String author; // 图书作者
	private String isbn; // 图书ISBN
	private String press; // 出版社
	private String version; // 版次
	private int pages; // 页数
	private int words; // 字数
	private String press_date; // 印刷时间
	private int size; // 开本
	private String paper; // 纸张
	private String categories;// 类别,不同类别之间用 # 分割 

	public Book() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getWords() {
		return words;
	}

	public void setWords(int words) {
		this.words = words;
	}

	public String getPress_date() {
		return press_date;
	}

	public void setPress_date(String press_date) {
		this.press_date = press_date;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

}
