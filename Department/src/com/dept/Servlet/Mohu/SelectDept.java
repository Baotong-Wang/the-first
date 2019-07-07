package com.dept.Servlet.Mohu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.Dao.WorkersSelectDao;
import com.dept.Daomain.Dept;

/**
 * Servlet implementation class SelectDept
 */
public class SelectDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//从前端接收用户输入的值,并一个对象来接受
		String sousuo = request.getParameter("sousuo");
		System.out.println(sousuo);
		
		//创建持久层对象
		WorkersSelectDao dao = new WorkersSelectDao();
		//调用查询方法
		List<Dept> ss = dao.selectDeptMohu(sousuo);

		request.setAttribute("list", ss);
		Object attribute = request.getAttribute("list");
		System.out.println(attribute);
		
		//跳转到搜索显示界面
		request.getRequestDispatcher("/DeptSouSuo.jsp").forward(request, response);
	}

}
