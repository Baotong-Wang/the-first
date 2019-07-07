package com.dept.Dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dept.Daomain.d_y;
import com.dept.jdbc.JdbcUtils;

/**
 * @author Wangbaotong
 *
 *
 */
public class d_yDao {
	
	/**
	 * 查询d_y表中的信息
	 */
	public List<d_y> select_d_y() {
		//创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			//如果查询到数据，直接返回
			return queryRunner.query("select * from d_y", new BeanListHandler<d_y>(d_y.class));
		} catch (SQLException e) {
			//如果没有查询到数据，则返回Null
			e.printStackTrace();
			return null;
		}
	}
}
