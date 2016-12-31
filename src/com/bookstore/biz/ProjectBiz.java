package com.bookstore.biz;

import com.bookstore.entity.Project;

public interface ProjectBiz {
	//通过id获取项目
	Project getProjectById(int id);
	//插入项目
	boolean insert(Project project);
	//插入项目返回自动增长的ID
	int insertAndReturnId(Project project);

}
