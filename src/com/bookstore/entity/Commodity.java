package com.bookstore.entity;

public class Commodity {

	private int id; // 商品id
	private int id_book; // 所售商品图书id
	private String state; //商品是否在架
	private int id_seller;// 卖家id
	private double price;// 商品价格
	private int number;// 商品库存数量
	private String title;// 商品标题
	private String description;// 商品描述
	private String image;// 商品图片
	private int view_count;//浏览量

	public Commodity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public int getId_seller() {
		return id_seller;
	}

	public void setId_seller(int id_seller) {
		this.id_seller = id_seller;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
