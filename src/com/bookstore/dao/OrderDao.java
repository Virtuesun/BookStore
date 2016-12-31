package com.bookstore.dao;

import com.bookstore.entity.Order;

public interface OrderDao {
	Order getOrderById(int id);
	int insert(Order order);

}
