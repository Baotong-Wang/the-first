package com.dept.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dept.Daomain.Dept;
import com.dept.Daomain.workers;
import com.dept.jdbc.JdbcUtils;
import com.dept.jdbc.TestUtil;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Wangbaotong
 *
 *         界面搜索实现类
 */
public class WorkersSelectDao {

	/**
	 * 员工的模糊查询
	 */
	public List<workers> selectWorkersMohu(String sousuo) {
		// 创建数据库连接对象
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			// 根据搜索字段，查询数据库中的数据，然后返回
			// sql="select *from employee where 1=1";
			String sql = "select *from workers where CONCAT(wname,',',wsex,',',wtel,',',wsalary,',',dept,',',wage)";
			//创建一个list集合
			List<String> list = new ArrayList<String>();

			// 判断输入的值是否为空或者为空格
//			System.out.println(sousuo);
			// System.out.println(sgender);
			if (!TestUtil.isEmpty(sousuo)) {
				//如果不为空，则在SQL语句后加上模糊查询关键字like，?代表查询字段
				sql = sql + " like ?";
				list.add("%" + sousuo + "%");
			}
			System.out.println(sql);
			// 这里面需要的是数组，所以需要把上面的list集合转成数组 list.toArray()
			// 这个其实有点懵 为什么里面需要的是数组呢
			List<workers> list2 = queryRunner.query(sql, new BeanListHandler<workers>(workers.class),
					list.toArray());
						return list2;
		} catch (SQLException e) {
			// 如果没有相关数据，则返回NULL
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 部门的模糊查询
	 * 
	 */
	 public List<Dept> selectDeptMohu(String sousou) {
		//创建数据库连接对象
		 QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		 String sql = "SELECT *FROM dept WHERE CONCAT(did,',',dname,',',dnumber,',',director,',',dlocation)";
		 String s1 = "%" + sousou + "%";
		 //创建一个List集合
		 //List<String> list = new ArrayList<String>();
		// 判断输入的值是否为空或者为空格
		 
		 if(!sousou.isEmpty()){
			 sql += " like ?";
//			 list.add("%" + sousou + "%");
		 }
		 
		 try {
			return queryRunner.query(sql, new BeanListHandler<Dept>(Dept.class),s1);
		} catch (SQLException e) {
			 e.printStackTrace();
			 return null;
		}
	}
	
	
}
