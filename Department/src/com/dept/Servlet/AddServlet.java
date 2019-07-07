package com.dept.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.DeptDao;
import com.dept.Daomain.Dept;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//获取部门信息
		String dname = request.getParameter("dname");
		//System.out.println(dname);
//		String dnumber1 = request.getParameter("dnumber");
		int dnumber = Integer.parseInt(request.getParameter("dnumber"));
		String director = request.getParameter("director");
		String dlocation = request.getParameter("dlocation");
		
		//获取的信息，我们需要创建一个对象模型，用来存储
		Dept dept = new Dept();
		dept.setDname(dname);
		dept.setDnumber(dnumber); 
		dept.setDirector(director);
		dept.setDlocation(dlocation);
		//创建持久层对象
		DeptDao dao = new DeptDao();
		//调用添加方法
		dao.add(dept);
	}

}
