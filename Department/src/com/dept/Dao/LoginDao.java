package com.dept.Dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.dept.Daomain.Dept;
import com.dept.Daomain.admin;
import com.dept.jdbc.JdbcUtils;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 登录操作的持久层对象
 * @author Wangbaotong
 *
 *
 */
public class LoginDao {
		/**
		 * 登录操作
		 */
	public admin login(String username,String password) {
		//创建一个JDBC连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			admin query = queryRunner.query("select * from admin where username = ? and password = ?", 
					new BeanHandler<admin>(admin.class),username,password);
			//如果没有异常，将对象返回
			return query;
		} catch (SQLException e) {
			e.printStackTrace();
			//如果有异常，返回null
			return null;
		}
	}
}
