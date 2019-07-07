package com.dept.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.DeptDao;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
	
		//执行删除操作时，需根据对应的id来进行删除，先拿到对应的id
		String id = request.getParameter("did");
		
		//创建持久层对象，调用删除的方法
		DeptDao dao = new DeptDao();
		//调用删除
		dao.delete(Integer.parseInt(id));
		response.getWriter().write(id);
	}

}
