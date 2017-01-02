package com.bookstore.dao;

import java.util.Vector;

import com.bookstore.entity.Commodity;
import com.bookstore.entity.CommodityItem;

public interface CommodityDao {
	// 通过id获取商品
	Commodity getCommodityById(int id);

	// 通过图书id获取商品
	Commodity getCommodityByBookId(int bookId);

	// 通过买家id获取商品
	Vector<Commodity> getCommoditiesBySellerId(int sellerId);

	// 通过图书名获取商品
	Vector<Commodity> getCommoditiesByBookName(String bookName);

	// 通过作者名获取商品
	Vector<Commodity> getCommoditiesByBookAuthor(String author);

	// 通过出版社获取商品
	Vector<Commodity> getCommoditiesByBookPress(String press);

	// 通过类别获取商品
	Vector<Commodity> getCommoditiesByBookCategory(String category);

	// 插入商品
	int insert(Commodity commodity);

	// 修改商品
	int update(Commodity commodity);

	// 删除商品
	int delete(Commodity commodity);

	// 获取商品项
	Vector<CommodityItem> getCommodityItemsByBookName(String bookName);

	Vector<CommodityItem> getCommodityItemsByBookAuthor(String author);

	Vector<CommodityItem> getCommodityItemsByBookCategory(String category);

	Vector<CommodityItem> getCommodityItemsBySellerName(String sellerName);
}
