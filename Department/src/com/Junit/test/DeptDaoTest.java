package com.Junit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dept.Dao.DeptDao;
import com.dept.Daomain.Dept;

/**
 * @author Wangbaotong
 *
 */
public class DeptDaoTest {
	Dept dept = new Dept();
	Dept dept1 = new Dept();
	Dept dept2 = new Dept();
	DeptDao dao = new DeptDao();
//	DeptDao dao1 = new DeptDao();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}
	
	/**
	 * 测试类（查询）
	 */
	@Test
	public void testSelectAll() {
		//dept.setDname("清洁部");
		boolean add1 = dao.selectAll1();
		assertEquals(true, add1);
	}

	/**
	 * 测试类（删除）
	 */
	@Test
	public void testDelete() {
		boolean delete1 = dao.delete1(16);
		assertEquals(true,delete1);
	}

	/**
	 * 测试类（修改）
	 */
	@Test
	public void testModifyDept() {
		dept1.setDname("保安部");
		dept1.setDid(7);
		boolean modifyDept1 = dao.modifyDept1(dept1);
		assertEquals(true, modifyDept1);
	}

	/**
	 * 测试类（添加）
	 */
	@Test
	public void testAdd() {
		dept2.setDname("律师部");
		boolean add1 = dao.add1(dept2);
		assertEquals(true, add1);
	}
	
}
