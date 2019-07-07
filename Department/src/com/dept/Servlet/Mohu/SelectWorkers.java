package com.dept.Servlet.Mohu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.dept.Dao.WorkersSelectDao;
import com.dept.Daomain.workers;

/**
 * Servlet implementation class SelectWorkers
 */
public class SelectWorkers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//从前端界面接受用户输入的值
//		String s = new String(request.getParameter("sousuo").getBytes("iso-8859-1"),"UTF-8");
		String sousuo = request.getParameter("sousuo");
		System.out.println(sousuo);
		//String temp = null;
		/*if(s != null){
			temp = new String(s.getBytes("iso-8859-1"),"UTF-8");
		}{
			response.getWriter().write("error!");
		}
		System.out.println("接受的值："+ temp);*/
		//创建持久层对象
		WorkersSelectDao dao = new WorkersSelectDao();
		//调用查询方法
		List<workers> list = dao.selectWorkersMohu(sousuo);
		System.out.println("查询" + list);
		request.setAttribute("list", list);
		//workers attribute = (workers)request.getSession().getAttribute("list");
		Object attribute2 = request.getAttribute("list");
		
		//System.out.println(attribute);
		System.out.println(attribute2);
		//向前端返回查询结果
		//response.getWriter().write(JSONObject.toJSONString(list));
		//response.sendRedirect("/Department/Sousuo.jsp");
		request.getRequestDispatcher("/Sousuo.jsp").forward(request, response);
	}

}
