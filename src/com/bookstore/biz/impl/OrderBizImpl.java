package com.bookstore.biz.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

import com.bookstore.biz.OrderBiz;
import com.bookstore.biz.util.BizUtil;
import com.bookstore.dao.OrderDao;
import com.bookstore.entity.Order;

public class OrderBizImpl implements OrderBiz {

	@Override
	public Order getOrderById(int id) {
		OrderDao orderDao = null;
		Order order = null;
		try {
			orderDao = (OrderDao) BizUtil.getDialectedDao(OrderDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (orderDao != null) {
			order = orderDao.getOrderById(id);
		}
		return order;
	}

	@Override
	public boolean insert(Order order) {
		OrderDao orderDao = null;
		boolean success = false;
		try {
			orderDao = (OrderDao) BizUtil.getDialectedDao(OrderDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (orderDao != null) {
			int result = orderDao.insert(order);
			if (result == 1) {
				success = true;
			}
		}
		return success;
	}

	@Override
	public Order getOrderByOrderId(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Order> getOrdersByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Order> getOrderBySellerId(int id_seller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Order> getOrderByBuyerId(int id_buyyer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

}
