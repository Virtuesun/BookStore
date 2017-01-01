package com.bookstore.entity;

public class CommodityItem {
	private String bookName; // 所售商品名称
	private String sellerName;// 卖家昵称
	private double price;// 商品价格
	private String author;//作者
	private String press;//出版社
	private String press_date;//出版时间
	private int number;// 商品库存数量
	private String title;// 商品标题
	private String description;// 商品描述
	private String image;// 商品图片
	private int view_count;//浏览量
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getPress_date() {
		return press_date;
	}
	public void setPress_date(String press_date) {
		this.press_date = press_date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}

}
