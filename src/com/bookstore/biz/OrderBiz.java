package com.bookstore.biz;

import java.util.Vector;
import com.bookstore.entity.Order;
import com.bookstore.entity.User;

public interface OrderBiz {
	//通过id获取订单
	Order getOrderById(int id);
	//通过订单号获取订单
	Order getOrderByOrderId(String orderId);
	//通过订单状态获取订单
	Vector<Order> getOrdersByState(String state,User user);
	//通过卖家ID获取订单
	Vector<Order> getOrderBySellerId(int id_seller);
	//通过买家ID获取订单
	Vector<Order> getOrderByBuyerId(int id_buyyer);
	//插入订单
	boolean insert(Order order);
	//修改订单
	boolean update(Order order);

}
