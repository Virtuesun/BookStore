package com.bookstore.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.bookstore.dao.OrderDao;
import com.bookstore.dao.base.BaseDao;
import com.bookstore.dao.base.RSProcessor;
import com.bookstore.entity.Order;
import com.bookstore.entity.User;

public class OrderDaoImpl extends BaseDao implements OrderDao {

	@Override
	public Order getOrderById(int id) {
		String sql = "select orderId,state,id_project, id_buyer,timestamp from `order` where id = ?";

		RSProcessor orderRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Order order = null;
				if (rs.next()) {
					order = new Order();
					order.setId(id);
					order.setOrderId(rs.getString("orderId"));
					order.setState(rs.getString("state"));
					order.setId_project(rs.getInt("id_project"));
					order.setId_buyer(rs.getInt("id_buyer"));
					order.setTimestamp(rs.getTimestamp("timestamp"));
				}

				return order;
			}

		};

		return (Order) executeQuery(orderRS, sql, id);
	}

	@Override
	public int insert(Order order) {
		String sql = "insert into `order` (`orderId`,`state`, `id_project`,`id_buyer`,`timestamp`) values(?,?,?,?,?)";
		Object[] params = {order.getOrderId(),order.getState(),order.getId_project(),order.getId_buyer(),order.getTimestamp()};
		return executeUpdate(sql, params);
	}

	@Override
	public Order getOrderByOrderId(String orderId) {
		
		String sql = "select * from `order` where orderId = ?";

		RSProcessor orderRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Order order = null;
				if (rs.next()) {
					order = new Order();
					order.setId(rs.getInt("id"));
					order.setOrderId(orderId);
					order.setState(rs.getString("state"));
					order.setId_project(rs.getInt("id_project"));
					order.setId_buyer(rs.getInt("id_buyer"));
					order.setTimestamp(rs.getTimestamp("timestamp"));
				}

				return order;
			}

		};

		return (Order) executeQuery(orderRS, sql, orderId);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Order> getOrdersByState(String state,User user) {
		
		
		String sql = "select * from `order` where orderId = ? and id_buyer = ?";

		RSProcessor orderRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Vector<Order> orders = new Vector<Order>();
				while(rs != null && rs.next()) {
					Order order = null;
					order = new Order();
					order.setId(rs.getInt("id"));
					order.setOrderId(rs.getString("orderId"));
					order.setState(state);
					order.setId_project(rs.getInt("id_project"));
					order.setId_buyer(rs.getInt("id_buyer"));
					order.setTimestamp(rs.getTimestamp("timestamp"));
					
					orders.add(order);
				}

				return orders;
			}

		};

		return (Vector<Order>) executeQuery(orderRS, sql, state,user.getId());
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Order> getOrderBySellerId(int id_seller) {
	
		String sql = "select * from `order` where id_project in (select  id from project where id_commodity in "
				+ "(select id from commodity where id_seller = ?))";

		RSProcessor orderRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Vector<Order> orders = new Vector<Order>();
				while(rs != null && rs.next()) {
					Order order = null;
					order = new Order();
					order.setId(rs.getInt("id"));
					order.setOrderId(rs.getString("orderId"));
					order.setState(rs.getString("state"));
					order.setId_project(rs.getInt("id_project"));
					order.setId_buyer(rs.getInt("id_buyer"));
					order.setTimestamp(rs.getTimestamp("timestamp"));
					
					orders.add(order);
				}

				return orders;
			}

		};

		return (Vector<Order>) executeQuery(orderRS, sql, id_seller);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Order> getOrderByBuyerId(int id_buyyer) {

		String sql = "select * from  `order` where id_buyer = ?";

		RSProcessor orderRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Vector<Order> orders = new Vector<Order>();
				while(rs != null && rs.next()) {
					Order order = null;
					order = new Order();
					order.setId(rs.getInt("id"));
					order.setOrderId(rs.getString("orderId"));
					order.setState(rs.getString("state"));
					order.setId_project(rs.getInt("id_project"));
					order.setId_buyer(rs.getInt("id_buyer"));
					order.setTimestamp(rs.getTimestamp("timestamp"));
					
					orders.add(order);
				}

				return orders;
			}

		};

		return (Vector<Order>) executeQuery(orderRS, sql, id_buyyer);
		
	}

	@Override
	public int update(Order order) {
		
		String sql = "update `order` set orderId = ?, state = ?, id_project = ?,id_buyer = ? where id = ?";
		Object[] params = {order.getOrderId(),order.getState(),order.getId_project(),order.getId_buyer(),order.getId()};
		return executeUpdate(sql, params);
		
	}

}
