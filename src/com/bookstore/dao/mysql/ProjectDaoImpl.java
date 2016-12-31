package com.bookstore.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.dao.ProjectDao;
import com.bookstore.dao.base.BaseDao;
import com.bookstore.dao.base.RSProcessor;
import com.bookstore.entity.Project;

public class ProjectDaoImpl extends BaseDao implements ProjectDao {

	@Override
	public Project getProjectById(int id) {
		String sql = "select id_commodity, number from `project` where id = ?";

		RSProcessor projectRS = new RSProcessor() {

			@Override
			public Object process(ResultSet rs) throws SQLException {
				Project project = null;
				if (rs.next()) {
					project = new Project();
					project.setId(id);
					project.setId_commodity(rs.getInt("id_commodity"));
					project.setNumber(rs.getInt("number"));
				}

				return project;
			}

		};

		return (Project) executeQuery(projectRS, sql, id);
	}

	@Override
	public int insert(Project project) {
		String sql = "insert into `project` (id_commodity, number) values(?,?)";
		Object[] params = {project.getId_commodity(),project.getNumber()};
		return executeUpdate(sql, params);
	}

}
