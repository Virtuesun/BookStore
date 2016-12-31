package com.bookstore.dao;

import com.bookstore.entity.Commodity;

public interface CommodityDao {
	Commodity getCommodityById(int id);
	int insert(Commodity commodity);
}
