package com.dept.Dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dept.Daomain.Onduty;
import com.dept.jdbc.JdbcUtils;

/**
 * @author Wangbaotong
 *
 *
 */
public class OnDutyDao {
		
	//添加值日人员
	public void addOnDuty(Onduty on) {
		//创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		try {
			//向数据库中添加数据
			queryRunner.update("INSERT INTO onduty VALUES(?,?,?)",
					on.getDept(),
					on.getO_name(),
					on.getO_time());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//查询所有值日人员
	public List<Onduty> selectOnduty() {
		//创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			//向数据库中查询数据
			return	queryRunner.query("select * from onduty", new BeanListHandler<Onduty>(Onduty.class));
		} catch (SQLException e) {
			//如果没有数据,则返回Null
			e.printStackTrace();
			return null;
		}
	}
}
