package com.dept.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.dept.Daomain.workers;
import com.dept.jdbc.JdbcUtils;
import com.dept.jdbc.TestUtil;

/**
 * @author Wangbaotong
 *
 *
 */
public class test2 {
	
	@Test
	public List<workers> test(String sousuo) {
			//创建数据库连接对象
			QueryRunner query = new QueryRunner(JdbcUtils.getDataSource());
			try {
				//根据搜索字段，查询数据库中的数据，然后返回String sql="select *from employee where 1=1";
				String sql="select *from workers where CONCAT(wname,',',wsex,',',wtel) 1=1";
				List<String>list = new ArrayList<String>();
				String s1 = "111";
				//判断有没有根据姓名查询 
				System.out.println(sousuo);
				//System.out.println(sgender);
						if(s1.isEmpty()){
							//sql+" and sname like ?";  注意“与and之间有一个空格...........
							sql =sql+" like ?";
							list.add("%"+sousuo+"%");
						}
						System.out.println(sql);
						//这里面需要的是数组，所以需要把上面的list集合转成数组 list.toArray()
						//这个其实有点懵  为什么里面需要的是数组呢
						List<workers> list2 = query.query(sql, new BeanListHandler<workers>(workers.class),list.toArray());
						return list2;
			} catch (SQLException e) {
				//如果没有相关数据，则返回NULL
				e.printStackTrace();
				return null;
			}
	}
}
