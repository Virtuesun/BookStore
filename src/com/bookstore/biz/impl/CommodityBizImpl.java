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
			 commodity = commodityDao.getCommodityByBookId(bookId);
			
		}
		return commodity;
		
	}

	@Override
	public Vector<Commodity> getCommoditiesBySellerId(int sellerId) {
		CommodityDao commodityDao = null;
		Vector<Commodity> commodities = new Vector<Commodity>();
		
		try {
				commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			 commodities = commodityDao.getCommoditiesBySellerId(sellerId);
			
		}
		return commodities;
		
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookName(String bookName) {
		
		CommodityDao commodityDao = null;
		Vector<Commodity> commodities = new Vector<Commodity>();
		
		try {
				commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			 commodities = commodityDao.getCommoditiesByBookName(bookName);
			
		}
		return commodities;
		
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookAuthor(String author) {
		
		CommodityDao commodityDao = null;
		Vector<Commodity> commodities = new Vector<Commodity>();
		
		try {
				commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			 commodities = commodityDao.getCommoditiesByBookAuthor(author);
			
		}
		return commodities;
		
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookPress(String press) {


		CommodityDao commodityDao = null;
		Vector<Commodity> commodities = new Vector<Commodity>();
		
		try {
				commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			 commodities = commodityDao.getCommoditiesByBookPress(press);
			
		}
		return commodities;
		
	}

	@Override
	public Vector<Commodity> getCommoditiesByBookCategory(String category) {


		CommodityDao commodityDao = null;
		Vector<Commodity> commodities = new Vector<Commodity>();
		
		try {
				commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			 commodities = commodityDao.getCommoditiesByBookCategory(category);
			
		}
		return commodities;
		
	}

	@Override
	public boolean update(Commodity commodity) {
		int influences = 0;
		CommodityDao commodityDao = null;
		boolean result = false;
		try {
			commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			 influences = commodityDao.update(commodity);
			
		}
		if(influences > 0){
			result = true;
		}
		return result;
		
	}

	@Override
	public boolean delete(Commodity commodity) {
		int influences = 0;
		CommodityDao commodityDao = null;
		boolean result = false;
		try {
			commodityDao = (CommodityDao) BizUtil.getDialectedDao(CommodityDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (commodityDao != null) {
			 influences = commodityDao.delete(commodity);
			
		}
		if(influences > 0){
			result = true;
		}
		return result;
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
