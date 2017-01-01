package com.bookstore.biz.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Vector;

import com.bookstore.biz.util.BizUtil;
import com.bookstore.dao.CommodityDao;
import com.bookstore.entity.Commodity;
import com.bookstore.entity.CommodityItem;

public class CommodityBizImpl implements com.bookstore.biz.CommodityBiz {

	@Override
	public Commodity getCommodityById(int id) {
		CommodityDao commodityDao = null;
		Commodity commodity = null;

		try {
			commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			commodity = commodityDao.getCommodityById(id);
		}
		return commodity;
	}

	@Override
	public boolean insert(Commodity commodity) {
		CommodityDao commodityDao = null;
		boolean success = false;

		try {
			commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			int result = commodityDao.insert(commodity);
			if (result == 1) {
				success = true;
			}
		}
		return success;
	}

	@Override
	public Commodity getCommodityByBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Commodity> getCommoditiesBySellerId(int sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookName(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookPress(String press) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Commodity commodity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Commodity commodity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vector<CommodityItem> getCommodityItemsByBookName(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<CommodityItem> getCommodityItemsByBookAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<CommodityItem> getCommodityItemsByBookCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<CommodityItem> getCommodityItemsBySellerName(String sellerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
