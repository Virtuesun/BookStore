package com.bookstore.biz.impl;

import java.lang.reflect.InvocationTargetException;

import com.bookstore.biz.ProjectBiz;
import com.bookstore.biz.util.BizUtil;
import com.bookstore.dao.ProjectDao;
import com.bookstore.entity.Project;

public class ProjectBizImpl implements ProjectBiz {

	@Override
	public Project getProjectById(int id) {
		ProjectDao projectDao = null;
		Project project = null;
		try {
			projectDao = (ProjectDao) BizUtil.getDialectedDao(ProjectDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (projectDao != null) {
			project = projectDao.getProjectById(id);
		}
		return project;
	}

	@Override
	public boolean insert(Project project) {
		ProjectDao projectDao = null;
		boolean success = false;
		try {
			projectDao = (ProjectDao) BizUtil.getDialectedDao(ProjectDao.class);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (projectDao != null) {
			int result = projectDao.insert(project);
			if (result == 1) {
				success = true;
			}
		}
		return success;
	}

	@Override
	public int insertAndReturnId(Project project) {
		// TODO Auto-generated method stub
		return 0;
	}

}
