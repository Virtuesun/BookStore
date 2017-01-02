package com.bookstore.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.bookstore.dao.base.BaseDao;
import com.bookstore.dao.base.RSProcessor;
import com.bookstore.entity.Commodity;

public class CommodityDaoImpl extends BaseDao implements com.bookstore.dao.CommodityDao {

	@Override
	public Commodity getCommodityById(int id) {
		String sql = "select id_book,state, id_seller,price,number,title,description,image,view_count from commodity where id = ?";

		RSProcessor commodityRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Commodity commodity = null;
				if (rs.next()) {
					commodity = new Commodity();
					commodity.setId(id);
					commodity.setId_book(rs.getInt("id_book"));
					commodity.setState(rs.getString("state"));
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
		String sql = "insert into commodity (id_book,state, id_seller,price,number,title,description,image) values(?,?,?,?,?,?,?,?)";
		Object[] params = { commodity.getId_book(),commodity.getState(), commodity.getId_seller(), commodity.getPrice(),
				commodity.getNumber(), commodity.getTitle(), commodity.getDescription(), commodity.getImage() };
		return executeUpdate(sql, params);
	}

	@Override
	public Commodity getCommodityByBookId(int bookId) {
		
		String sql = "select * from commodity where id_book = ?";

		RSProcessor commodityRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Commodity commodity = null;
				if (rs.next()) {
					commodity = new Commodity();
					commodity.setId(rs.getInt("id"));
					commodity.setId_book(bookId);
					commodity.setState(rs.getString("state"));
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

		return (Commodity) executeQuery(commodityRS, sql, bookId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Commodity> getCommoditiesBySellerId(int sellerId) {


		String sql = "select * from commodity where id_seller = ?";

		RSProcessor commodityRS = new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				
				Vector<Commodity> commodities = new Vector<Commodity>();
				
				
				while(rs != null && rs.next()) {
					Commodity commodity = new Commodity();
					commodity = new Commodity();
					commodity.setId(rs.getInt("id"));
					commodity.setId_book(rs.getInt("id_book"));
					commodity.setState(rs.getString("state"));
					commodity.setId_seller(sellerId);
					commodity.setPrice(rs.getDouble("price"));
					commodity.setNumber(rs.getInt("number"));
					commodity.setTitle(rs.getString("title"));
					commodity.setDescription(rs.getString("description"));
					commodity.setImage(rs.getString("image"));
					commodity.setView_count(rs.getInt("view_count"));
					
					commodities.add(commodity);
				}

				return commodities;
			}

		};

		return  (Vector<Commodity>) executeQuery(commodityRS, sql, sellerId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Commodity> getCommoditiesByBookName(String bookName) {
		
		String sql = "select * from commodity where id in (select id from book where name = ?)";

		RSProcessor commodityRS = new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				
				Vector<Commodity> commodities = new Vector<Commodity>();
				
				
				while(rs != null && rs.next()) {
					Commodity commodity = new Commodity();
					commodity = new Commodity();
					commodity.setId(rs.getInt("id"));
					commodity.setId_book(rs.getInt("id_book"));
					commodity.setState(rs.getString("state"));
					commodity.setId_seller(rs.getInt("id_seller"));
					commodity.setPrice(rs.getDouble("price"));
					commodity.setNumber(rs.getInt("number"));
					commodity.setTitle(rs.getString("title"));
					commodity.setDescription(rs.getString("description"));
					commodity.setImage(rs.getString("image"));
					commodity.setView_count(rs.getInt("view_count"));
					
					commodities.add(commodity);
				}

				return commodities;
			}

		};

		return  (Vector<Commodity>) executeQuery(commodityRS, sql, bookName);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Commodity> getCommoditiesByBookAuthor(String author) {
		

		String sql = "select * from commodity where id in (select id from book where author = ?)";

		RSProcessor commodityRS = new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				
				Vector<Commodity> commodities = new Vector<Commodity>();
				
				
				while(rs != null && rs.next()) {
					Commodity commodity = new Commodity();
					commodity = new Commodity();
					commodity.setId(rs.getInt("id"));
					commodity.setId_book(rs.getInt("id_book"));
					commodity.setState(rs.getString("state"));
					commodity.setId_seller(rs.getInt("id_seller"));
					commodity.setPrice(rs.getDouble("price"));
					commodity.setNumber(rs.getInt("number"));
					commodity.setTitle(rs.getString("title"));
					commodity.setDescription(rs.getString("description"));
					commodity.setImage(rs.getString("image"));
					commodity.setView_count(rs.getInt("view_count"));
					
					commodities.add(commodity);
				}

				return commodities;
			}

		};

		return  (Vector<Commodity>) executeQuery(commodityRS, sql, author);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Commodity> getCommoditiesByBookPress(String press) {
		
		String sql = "select * from commodity where id in (select id from book where press = ?)";

		RSProcessor commodityRS = new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				
				Vector<Commodity> commodities = new Vector<Commodity>();
				
				
				while(rs != null && rs.next()) {
					Commodity commodity = new Commodity();
					commodity = new Commodity();
					commodity.setId(rs.getInt("id"));
					commodity.setId_book(rs.getInt("id_book"));
					commodity.setState(rs.getString("state"));
					commodity.setId_seller(rs.getInt("id_seller"));
					commodity.setPrice(rs.getDouble("price"));
					commodity.setNumber(rs.getInt("number"));
					commodity.setTitle(rs.getString("title"));
					commodity.setDescription(rs.getString("description"));
					commodity.setImage(rs.getString("image"));
					commodity.setView_count(rs.getInt("view_count"));
					
					commodities.add(commodity);
				}

				return commodities;
			}

		};

		return  (Vector<Commodity>) executeQuery(commodityRS, sql, press);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Vector<Commodity> getCommoditiesByBookCategory(String category) {
		
		
		String sql = "select * from commodity where id in (select id from book where categories = ?)";

		RSProcessor commodityRS = new RSProcessor() {
			
			@Override
			public Object process(ResultSet rs) throws SQLException {
				
				Vector<Commodity> commodities = new Vector<Commodity>();
				
				
				while(rs != null && rs.next()) {
					Commodity commodity = new Commodity();
					commodity = new Commodity();
					commodity.setId(rs.getInt("id"));
					commodity.setId_book(rs.getInt("id_book"));
					commodity.setState(rs.getString("state"));
					commodity.setId_seller(rs.getInt("id_seller"));
					commodity.setPrice(rs.getDouble("price"));
					commodity.setNumber(rs.getInt("number"));
					commodity.setTitle(rs.getString("title"));
					commodity.setDescription(rs.getString("description"));
					commodity.setImage(rs.getString("image"));
					commodity.setView_count(rs.getInt("view_count"));
					
					commodities.add(commodity);
				}

				return commodities;
			}

		};

		return  (Vector<Commodity>) executeQuery(commodityRS, sql, category);
		
	}

	@Override
	public int update(Commodity commodity) {
		
		
		String sql = "update commodity  set id_book = ?, state = ?,id_seller = ?,price = ?,"
				+ "number = ?,title = ?,description = ?,image = ? where id = ?";
		Object[] params = { commodity.getId_book(), commodity.getState(),commodity.getId_seller(), commodity.getPrice(),
				commodity.getNumber(), commodity.getTitle(), commodity.getDescription(), commodity.getImage(),commodity.getId() };
		
		return executeUpdate(sql, params);
		
		
	}

	@Override
	public int delete(Commodity commodity) {
		
		String sql = "delete from commodity where id = ?";
		Object[] params = { commodity.getId() };
		return  executeUpdate(sql, params);
		
	}

}
