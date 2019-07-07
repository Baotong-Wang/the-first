package com.dept.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.dept.Dao.DeptDao;
import com.dept.Daomain.Dept;

public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文乱码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//通过持久层对象查询
		/**
		 * 创建持久层对象
		 */
		DeptDao dao = new DeptDao();
		
		//查询所有
		/**
		 * 使用持久层对象调用其的查询方法
		 */
		List<Dept> depts = dao.selectAll();
		
		//将查询到的结果，返回给当前前端页面
		response.getWriter().write(JSONObject.toJSONString(depts));
		
	}

}
