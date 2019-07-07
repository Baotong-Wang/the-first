package com.dept.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.DeptDao;
import com.dept.Daomain.Dept;

/**
 * Servlet implementation class modifySetvlet
 */
public class modifySetvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
//		request.getParameter("");
//		request.getParameter("");
//		request.getParameter("");
//		request.getParameter("");
//		request.getParameter("");
		//获取前端用户所输入的值
		String dname = request.getParameter("dname");
		//System.out.println(dname);
//		String dnumber1 = request.getParameter("dnumber");
		int dnumber = Integer.parseInt(request.getParameter("dnumber"));
		String director = request.getParameter("director");
		String dlocation = request.getParameter("dlocation");
		int did = Integer.parseInt(request.getParameter("did"));
		//创建一个类对象，用来存储前端输入的值
		Dept dept = new Dept();
		dept.setDname(dname);
		dept.setDnumber(dnumber); 
		dept.setDirector(director);
		dept.setDlocation(dlocation);
		dept.setDid(did);
		
		//创建持久层对象
		DeptDao dao = new DeptDao();
		//调用修改方法
		dao.modifyDept(dept);
		
		response.sendRedirect("/Department/select.jsp");
	}

}
