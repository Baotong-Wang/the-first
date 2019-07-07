package com.dept.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.workersDao;
import com.dept.Daomain.workers;

/**
 * Servlet implementation class AddWorkersServlet
 */
public class AddWorkersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//获取员工信息
		String wname = request.getParameter("wname");
		System.out.println(wname);
		int wage =Integer.parseInt(request.getParameter("wage"));
		String wsex = request.getParameter("wsex");
		int wtel = Integer.parseInt(request.getParameter("wtel").trim());
		int wsalary = Integer.parseInt(request.getParameter("wsalary"));
		String dept = request.getParameter("dept");
		
		//创建workers对象用来存储信息
		workers w1 = new workers();
		w1.setWname(wname);
		w1.setWage(wage);
		w1.setWsex(wsex);
		w1.setWtel(wtel);
		w1.setWsalary(wsalary);
		w1.setDept(dept);
		System.out.println(w1);
		//创建持久层对象
		workersDao dao = new workersDao();
		//调用添加方法,将workers的对象作为参数传进去
		dao.addworkers(w1);
	}

	

}
