package com.bookstore.biz.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.bookstore.dao.base.BaseDao;

public class BizUtil {
	public static BaseDao getDialectedDao(Class<?> clazz)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String fullClassName = clazz.getCanonicalName();
		int lastIndexOfDot = fullClassName.lastIndexOf(".");

		String packageName = fullClassName.substring(0, lastIndexOfDot);
		String className = fullClassName.substring(lastIndexOfDot + 1);

		String newFullClassName = packageName + "." + BaseDao.sqlDialect + "." + className + "Impl";

		Class<?> newClazz = Class.forName(newFullClassName);
		Constructor<?> constructor = newClazz.getConstructor();
		Object newInstance = constructor.newInstance();
		
		if(newInstance instanceof BaseDao) {
			return (BaseDao) newInstance;
		}

		return null;
	}
}

