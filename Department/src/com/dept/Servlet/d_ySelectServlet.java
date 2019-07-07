package com.dept.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.dept.Dao.DeptDao;
import com.dept.Dao.d_yDao;
import com.dept.Daomain.Dept;
import com.dept.Daomain.d_y;

/**
 * Servlet implementation class d_ySelectSetvlet
 */
public class d_ySelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//制定中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//通过持久层对象查询
		/**
		 * 创建持久层对象
		 */
		d_yDao dao = new d_yDao();
		
		//查询所有
		/**
		 * 使用持久层对象调用其的查询方法
		 */
		List<d_y> select_d_y = dao.select_d_y();
//		System.out.println(select_d_y);
		
		//将查询到的结果，返回给当前前端页面
		response.getWriter().write(JSONObject.toJSONString(select_d_y));
		
	}

}
