package com.dept.Dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dept.Daomain.Dept;
import com.dept.Daomain.workers;
import com.dept.jdbc.JdbcUtils;
/**
 * @author Wangbaotong
 *
 */
public class workersDao {
	
	/**
	 * 查询员工信息
	 */
	public List<workers> selectworkers() {
		//创建数据库对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		try {
			//如果没有异常，直接返回结果
			List<workers> workers = queryRunner.query("select * from workers", new BeanListHandler<workers>(workers.class));
			//检查是否从数据库里获取到了值
			System.out.println(workers);
			return workers;
		} catch (SQLException e) {
			e.printStackTrace();
			//如果出现了异常，直接返回空
			return null;
		}
	}
	/**
	 * 删除员工信息
	 */
	public void deleteWorkers(int id) {
		//创建数据连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		try {
			//有这条信息则删除
			queryRunner.update("delete from workers where yid = ?",id);
		} catch (SQLException e) {
			//没有这天信息则报出异常
			e.printStackTrace();
		}
	}
	/**
	 * 添加员工信息
	 */
	public void addworkers(workers workers) {
		//创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		/**
		 * 添加员工
		 */
		try {
			queryRunner.update("insert into workers values(null,?,?,?,?,?,?)",
					workers.getWname(),//获取员工姓名
					workers.getWage(),//获取员工年龄
					workers.getWsex(),//获取员工性别
					workers.getWtel(),//获取员工电话
					workers.getWsalary(),//获取员工工资
					workers.getDept());//获取员工所属部门
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 修改员工信息
	 */
	public void modifyWorkers(workers wor) {
		//创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		String sql = "UPDATE workers SET wname=?,wage=?,wsex=?,wtel=?,wsalary=?,dept=? WHERE yid = ? ";
		try {
			//将修改的SQL语句添加进去，根据用户所输入员工编号的值进行修改
			queryRunner.update(sql,wor.getWname(),wor.getWage(),wor.getWsex(),wor.getWtel(),wor.getWsalary(),wor.getDept(),wor.getYid());
		} catch (SQLException e) {
			//如果没有该员工编码，则出现异常
			e.printStackTrace();
		}
	}
}
