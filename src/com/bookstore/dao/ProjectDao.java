package com.bookstore.dao;

import com.bookstore.entity.Project;

public interface ProjectDao {
	Project getProjectById(int id);
	int insert(Project project);
	//插入项目返回自动增长的ID
	int insertAndReturnId(Project project);
	
	int delete(Project project);
}
