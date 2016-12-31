package com.bookstore.entity;

import java.sql.Timestamp;

public class Order {
	private int id;// 订单id
	private String orderId;// 订单号
	private String state;//订单状态
	private int id_project;// 项目id
	private int id_buyer;// 买家id
	private Timestamp timestamp;// 订单生成日期

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getId_project() {
		return id_project;
	}

	public void setId_project(int id_project) {
		this.id_project = id_project;
	}

	public int getId_buyer() {
		return id_buyer;
	}

	public void setId_buyer(int id_buyer) {
		this.id_buyer = id_buyer;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
