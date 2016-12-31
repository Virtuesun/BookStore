package com.bookstore.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.bookstore.dao.base.BaseDao;
import com.bookstore.dao.base.RSProcessor;
import com.bookstore.entity.Commodity;

public class CommodityDaoImpl extends BaseDao implements com.bookstore.dao.CommodityDao {

	@Override
	public Commodity getCommodityById(int id) {
		String sql = "select id_book, id_seller,price,number,title,description,image,view_count from commodity where id = ?";

		RSProcessor commodityRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Commodity commodity = null;
				if (rs.next()) {
					commodity = new Commodity();
					commodity.setId(id);
					commodity.setId_book(rs.getInt("id_book"));
					commodity.setId_seller(rs.getInt("id_seller"));
					commodity.setPrice(rs.getDouble("price"));
					commodity.setNumber(rs.getInt("number"));
					commodity.setTitle(rs.getString("title"));
					commodity.setDescription(rs.getString("description"));
					commodity.setImage(rs.getString("image"));
					commodity.setView_count(rs.getInt("view_count"));
				}

				return commodity;
			}

		};

		return (Commodity) executeQuery(commodityRS, sql, id);
	}

	@Override
	public int insert(Commodity commodity) {
		String sql = "insert into commodity (id_book, id_seller,price,number,title,description,image) values(?,?,?,?,?,?,?)";
		Object[] params = { commodity.getId_book(), commodity.getId_seller(), commodity.getPrice(),
				commodity.getNumber(), commodity.getTitle(), commodity.getDescription(), commodity.getImage() };
		return executeUpdate(sql, params);
	}

}
