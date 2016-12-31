package com.bookstore.entity;

public class Project {
	private int id;// 项目id
	private int id_commodity;// 商品id
	private int number;// 购买数量

	public Project() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_commodity() {
		return id_commodity;
	}

	public void setId_commodity(int id_commodity) {
		this.id_commodity = id_commodity;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
