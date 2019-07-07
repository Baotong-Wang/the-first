package com.dept.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.workersDao;
import com.dept.Daomain.workers;

/**
 * Servlet implementation class DeleteWorkersServlet
 */
public class DeleteWorkersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//执行删除操作时，需根据对应的id来进行删除，先拿到对应的id
		int id = Integer.parseInt(request.getParameter("yid"));
//		System.out.println(id);
		//创建持久层对象
		workersDao w1 = new workersDao();
		//调用删除方法
		w1.deleteWorkers(id);
		response.getWriter().write(id);
	}

}
