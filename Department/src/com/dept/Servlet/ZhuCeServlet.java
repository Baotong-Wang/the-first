package com.dept.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.DeptDao;
import com.dept.Dao.LoginDao;
import com.dept.Daomain.admin;

/**
 * Servlet implementation class ZhuCe
 */
public class ZhuCeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//获取注册信息
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
//		System.out.println(username);
//		System.out.println(password);
		//获取的信息，我们需要创建一个对象模型，用来存储
		admin a1 = new admin();
		a1.setUsername(username);
		a1.setPassword(password);
		
		//创建持久层对象
		DeptDao deptDao = new DeptDao();
		//调用添加方法
		deptDao.addadmin(a1);
//		System.out.println(a1);
	}

}
