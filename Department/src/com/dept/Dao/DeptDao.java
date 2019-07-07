package com.dept.Dao;


/**
 * @author Wangbaotong
 *
 */


import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dept.Daomain.Dept;
import com.dept.Daomain.admin;
import com.dept.jdbc.JdbcUtils;
import com.sun.org.apache.regexp.internal.recompile;
import com.sun.tracing.dtrace.DependencyClass;
/**
 * 部门信息操作持久层对象
 */
public class DeptDao {
	
	/**
	 * 查询所有部门信息
	 */
	public List<Dept> selectAll() {
		//创建数据库对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			//如果没有异常，直接返回结果
			 List<Dept> s1 = queryRunner.query("select * from dept", new BeanListHandler<Dept>(Dept.class));
			 //查看是否查询到值
			 //System.out.println(s1);
			 return s1;
		} catch (SQLException e) {
			e.printStackTrace();
			//如果出现了异常，直接返回空
			return null;
		}
	}
	/**
	 * 删除部门信息
	 */
	public void delete(int id) {
		//创建数据库对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		try {
			//删除信息
			 queryRunner.update("delete from dept where did = ?",id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *	修改部门信息 
	 */
	public void modifyDept(Dept dept) {
		//创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		try {
			//添加查询语句，从界面中获取用户更改的值，根据用户输入的id来修改数据库中的值
				queryRunner.update("update dept set dname=?,dnumber=?,director=?,dlocation=? where did=?",
					dept.getDname(),//获取用户输入的姓名
					dept.getDnumber(),//获取用户输入的人数
					dept.getDirector(),//获取用户输入的负责人姓名
					dept.getDlocation(),//获取用户输入的工作地点
					dept.getDid());//获取用户想修改的部门的编号
		} catch (SQLException e) {
			//如果没有该id，则返回空
			e.printStackTrace();
		}
	}
	
	/**
	 * 添加用户
	 */
	public void addadmin(admin admin1) {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			//向数据库添加数据
			queryRunner.update("insert into admin values(?,?)",
					admin1.getUsername(),//调用get方法获取名称
					admin1.getPassword());//调用get方法获取密码
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 添加部门信息
	 */
	public void add(Dept dept) {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			//向数据库添加信息
			queryRunner.update("insert into dept values(null,?,?,?,?)",
					dept.getDname(),//调用get方法获取名称
					dept.getDnumber(),//调用get方法获取人数
					dept.getDirector(),//调用get方法获取负责人
					dept.getDlocation());//调用get方法获取工作地点
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 *	修改部门信息 （测试）
	 */
	public boolean modifyDept1(Dept dept) {
		//创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		try {
			//添加查询语句，从界面中获取用户更改的值，根据用户输入的id来修改数据库中的值
				queryRunner.update("update dept set dname=?where did=?",
					dept.getDname(),//获取用户输入的姓名
//					dept.getDnumber(),//获取用户输入的人数
//					dept.getDirector(),//获取用户输入的负责人姓名
//					dept.getDlocation(),//获取用户输入的工作地点
					dept.getDid());//获取用户想修改的部门的编号
				System.out.println("信息修改成功！");
				return true;
		} catch (SQLException e) {
			//如果没有该id，则返回空
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 添加部门信息（测试）
	 */
	public boolean add1(Dept dept) {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			//向数据库添加信息
			queryRunner.update("insert into dept values(null,?,0,0,0)",
					dept.getDname());//调用get方法获取名称
//					dept.getDnumber(),//调用get方法获取人数
//					dept.getDirector(),//调用get方法获取负责人
//					dept.getDlocation());//调用get方法获取工作地点
			System.out.println("添加"+ dept.getDname() + "成功！");
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * 删除部门信息（测试）
	 */
	public boolean delete1(int id) {
		//创建数据库对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		
		try {
			//删除信息
			 queryRunner.update("delete from dept where did = ?",id);
			 System.out.println("编号为" + id + "以成功删除！"  );
			 return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * 查询所有部门信息(测试)
	 */
	public boolean selectAll1() {
		//创建数据库对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			//如果没有异常，直接返回结果
			 List<Dept> s1 = queryRunner.query("select * from dept", new BeanListHandler<Dept>(Dept.class));
			 //查看是否查询到值
//			 System.out.println(s1);
			 //将查询到的值迭代输出
			 Iterator<Dept> iterator = s1.iterator();
			 while (iterator.hasNext()) {
				Dept dept = (Dept) iterator.next();
				System.out.println(dept);
			}
			 if(s1 != null){
				 return true;
			 }else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			//如果出现了异常，直接返回空
			return false;
		}
	}
}
