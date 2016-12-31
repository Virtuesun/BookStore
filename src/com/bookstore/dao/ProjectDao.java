package com.bookstore.dao;

import com.bookstore.entity.Project;

public interface ProjectDao {
	Project getProjectById(int id);
	int insert(Project project);
}
