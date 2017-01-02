package com.bookstore.biz.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

import com.bookstore.biz.OrderBiz;
import com.bookstore.biz.util.BizUtil;
import com.bookstore.dao.OrderDao;
import com.bookstore.entity.Order;
import com.bookstore.entity.User;

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
			order = orderDao.getOrderByOrderId(orderId);
		}
		return order;
		
	}

	

	@Override
	public Vector<Order> getOrderBySellerId(int id_seller) {
		
		OrderDao orderDao = null;
		Vector<Order> orders = new Vector<Order>();
		try {
			orderDao = (OrderDao) BizUtil.getDialectedDao(OrderDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (orderDao != null) {
			orders = orderDao.getOrderBySellerId(id_seller);
		}
		return orders;
		
	}

	@Override
	public Vector<Order> getOrderByBuyerId(int id_buyyer) {
		
		OrderDao orderDao = null;
		Vector<Order> orders = new Vector<Order>();
		try {
			orderDao = (OrderDao) BizUtil.getDialectedDao(OrderDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (orderDao != null) {
			orders = orderDao.getOrderByBuyerId(id_buyyer);
		}
		return orders;
		
	}

	@Override
	public boolean update(Order order) {
		
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
			int result = orderDao.update(order);
			if (result == 1) {
				success = true;
			}
		}
		return success;
		
	}

	@Override
	public Vector<Order> getOrdersByState(String state, User user) {
		
		OrderDao orderDao = null;
		Vector<Order> orders = new Vector<Order>();
		try {
			orderDao = (OrderDao) BizUtil.getDialectedDao(OrderDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (orderDao != null) {
			orders = orderDao.getOrdersByState(state, user);
		}
		return orders;
		
	}

}
