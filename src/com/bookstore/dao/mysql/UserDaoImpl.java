package com.bookstore.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.dao.UserDao;
import com.bookstore.dao.base.BaseDao;
import com.bookstore.dao.base.RSProcessor;
import com.bookstore.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User getUserById(int id) {
		String sql = "select role, username, showname,password,sex,age,email,phone,address from user where id = ?";

		RSProcessor userRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				User user = null;
				if (rs.next()) {
					user = new User();
					user.setId(id);
					user.setRole(rs.getString("role"));
					user.setUsername(rs.getString("username"));
					user.setShowname(rs.getString("showname"));
					user.setPassword(rs.getString("password"));
					user.setSex(rs.getString("sex"));
					user.setAge(rs.getInt("age"));
					user.setEmail(rs.getString("email"));
					user.setPhone(rs.getString("phone"));
					user.setAddress(rs.getString("address"));

				}

				return user;
			}

		};

		return (User) executeQuery(userRS, sql, id);
	}

	@Override
	public User getUserByUserName(String username) {
		String sql = "select id,role, showname,password,sex,age,email,phone,address from user where username = ?";

		RSProcessor userRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				User user = null;
				if (rs.next()) {
					user = new User();
					user.setId(rs.getInt("id"));
					user.setRole(rs.getString("role"));
					user.setUsername(username);
					user.setShowname(rs.getString("showname"));
					user.setPassword(rs.getString("password"));
					user.setSex(rs.getString("sex"));
					user.setAge(rs.getInt("age"));
					user.setEmail(rs.getString("email"));
					user.setPhone(rs.getString("phone"));
					user.setAddress(rs.getString("address"));

				}

				return user;
			}

		};

		return (User) executeQuery(userRS, sql, username);
	}

	@Override
	public int insert(User user) {
		String sql = "insert into user (role, username, showname,password,sex,age,email,phone,address) values(?,?,?,?,?,?,?,?,?)";
		Object[] params = { user.getRole(),user.getUsername(), user.getShowname(), user.getPassword(),user.getSex(),user.getAge(), user.getEmail(),
				user.getPhone(),user.getAddress() };
		return executeUpdate(sql, params);
	}

	@Override
	public int update(User user) {
		String sql = "update `user` set role=?, username=?, showname=?,password=?,sex=?,age=?,email=?,phone=?,address=? where id=?";
		Object[] params = { user.getRole(),user.getUsername(), user.getShowname(), user.getPassword(),user.getSex(),user.getAge(), user.getEmail(),
				user.getPhone(),user.getAddress(),user.getId() };
		return this.executeUpdate(sql, params);
	}

}
