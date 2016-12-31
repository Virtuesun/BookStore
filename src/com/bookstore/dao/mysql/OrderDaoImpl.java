package com.bookstore.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.dao.OrderDao;
import com.bookstore.dao.base.BaseDao;
import com.bookstore.dao.base.RSProcessor;
import com.bookstore.entity.Order;

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
		String sql = "insert into `order` (orderId, id_project,id_buyer) values(?,?,?)";
		Object[] params = {order.getOrderId(),order.getId_project(),order.getId_buyer()};
		return executeUpdate(sql, params);
	}

}
