//package com.dept.test;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.BeanListHandler;
//
//import com.dept.Daomain.admin;
//import com.dept.Daomain.yh;
//import com.dept.jdbc.JdbcUtils;
//
///**
// * 
// * @author Wangbaotong
// *
// */
//public class Test {
//	
//	@org.junit.Test
//	public void test() throws SQLException {
//		//创建数据库帮助工具对象
//		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
//		
//		/**
//		 * BeanListHandler将查询的结果存储在List集合中
//		 */
//		//执行查询语句：查询所有
//		List<yh> query = queryRunner.query("select * from yh", new BeanListHandler<yh>(yh.class));
//		//查询结果
//		//System.out.println(query);
//		
//		List<admin> query1 = queryRunner.query("select * from admin", new BeanListHandler<admin>(admin.class));
//		//查询结果
//		System.out.println(query1);
//		
//		
//		//执行查询语句：查询单个
//		List<yh> query2 = queryRunner.query("select * from yh where yid = ?",new BeanListHandler<yh>(yh.class),1);
//		//查询结果
//		//System.out.println(query2);
//		
//	}
//}
