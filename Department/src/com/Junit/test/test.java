package com.Junit.test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dept.Dao.DeptDao;
import com.dept.Daomain.Dept;

import java.util.Arrays;  
import java.util.Collection;  

import org.junit.Assert;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.junit.runners.Parameterized;  
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Wangbaotong
 *
 *
 */
public class test {
	/**
	 * 测试方法
	 */
	public Scanner scanner;
	public test() {
		 scanner = new Scanner(System.in);
	}
	
	
	@org.junit.Test
	public void Test() {
		//创建本类的对象
		DeptDao dao = new DeptDao();
		//创建Dept对象
		Dept dept = new Dept();
		Dept dept1 = new Dept();
		
		//添加方法测试：
		do{
			System.out.println("请输入要添加的部门名称：");
			dept.setDname(new Scanner(System.in).next());
			dao.add1(dept);
			System.out.println("是否继续添加？  1:(YES)/2:(NO)");
		}while(new Scanner(System.in).nextInt() == 1);
	
		//查询方法测试：
		System.out.println("是否查询所有部门？  1:(YES)/2:(NO)");
		int next = scanner.nextInt();
		if(next == 1){
			List<Dept> selectAll = dao.selectAll();
		Iterator<Dept> iterator = selectAll.iterator();
		while (iterator.hasNext()) {
			Dept dept2 = (Dept) iterator.next();
			System.out.println(dept2);
		}
		}else {
			System.out.println("以取消查询！");
		}
		
		//删除方法测试：
		do{
			System.out.println("请输入要删除的部门编号：");
			dao.delete(new Scanner(System.in).nextInt());
			System.out.println("部门编号已成功删除！是否重新查询？ 1:(YES)/2:(NO)");
			int next1 = scanner.nextInt();
			if(next1 == 1){
				List<Dept> selectAll = dao.selectAll();
				dept.getDid();
				dept.getDname();
				dept.getDnumber();
				dept.getDirector();
				dept.getDlocation();
				assertEquals(dept,selectAll);
				System.out.println();
			}else {
				System.out.println("以取消查询！");
			}
			System.out.println("是否继续删除？1:(YES)/2:(NO) ");
		}while(new Scanner(System.in).nextInt() == 1);
		
		//修改方法测试：
		System.out.println("是否对部门信息进行修改？1:(YES)/2:(NO)");
			int next2 = scanner.nextInt();
		while(next2 == 1){
			System.out.println("请输入所修改的部门编号：");
			int next3 = scanner.nextInt();
			dept1.setDid(next3);
			System.out.println("请输入需要修改的名称：");
			dept1.setDname(new Scanner(System.in).next());
			
			dao.modifyDept1(dept1);
			System.out.println("修改成功，是否重新查询？  1:(YES)/2:(NO)");
			int next1 = scanner.nextInt();
			if(next1 == 1){
				dao.selectAll();
			}else {
				System.out.println("以取消查询！");
			}
			
			System.out.println("是否继续修改？ 1:(YES)/2:(NO)");
			int n1 = scanner.nextInt();
			if(n1 == 1){
				next2 = 1;
			}else {
				next2 = 0;
				System.out.println("测试已结束！");
			}
		}
	}
}
