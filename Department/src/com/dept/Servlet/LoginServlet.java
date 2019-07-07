package com.dept.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.LoginDao;
import com.dept.Daomain.admin;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户输入的账号和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//调用持久层对象，帮助我们查询
		LoginDao loginDao = new LoginDao();
		//调用查询
		admin login = loginDao.login(username, password);
		
		//判断对象是否为空
		if(login != null){
			//登录成功，转到首页
//			response.getWriter().write("登录成功！");
//			response.sendRedirect("/Department/home.jsp");
			
		}else {
			//登录失败，请重新登录，转到登录界面
			PrintWriter out = response.getWriter();
			out.println("<script language='javascript'>alert('用户名或密码错误，请重新输入！')</script>");
			System.out.println("用户名或密码错误，请重新输入！");
			response.getWriter().write("帐号密码有误！");
			response.sendRedirect("/Department/Login.jsp");
		}
	}

}
