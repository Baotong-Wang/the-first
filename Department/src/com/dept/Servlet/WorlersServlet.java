package com.dept.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.alibaba.fastjson.JSONObject;
import com.dept.Dao.workersDao;
import com.dept.Daomain.workers;

/**
 * Servlet implementation class WorlersServlet
 */
public class WorlersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	
		//创建持久层对象
		workersDao dao = new workersDao();
		
		//调用查询方法
		List<workers> selectworkers = dao.selectworkers();
		System.out.println(selectworkers);
		//将查询到的结果传递给前端
		response.getWriter().write(JSONObject.toJSONString(selectworkers));
	}

}
